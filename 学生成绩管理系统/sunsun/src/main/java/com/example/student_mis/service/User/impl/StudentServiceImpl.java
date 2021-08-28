package com.example.student_mis.service.User.impl;

import com.example.student_mis.dao.Profession.ProfessionMapper;
import com.example.student_mis.dao.User.StudentMapper;
import com.example.student_mis.domain.Profession;
import com.example.student_mis.dto.User;
import com.example.student_mis.service.User.StudentService;
import com.example.student_mis.utils.PagingResult;
import com.github.pagehelper.PageRowBounds;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/4 18:44
 */
@Service
public class StudentServiceImpl implements StudentService {


    @Resource
    private StudentMapper studentMapper;

    @Autowired
    private ProfessionMapper professionMapper;

    @Override
    @Transactional
    public void addStudent(User user) {
        int professionId = 0;
        int count = professionMapper.checkProfessionCount(user.getProfession());
        if (count > 0) {
            Profession profession = professionMapper.getProfessionIdByName(user.getProfession());
            professionId = profession.getId();
        } else {
            Profession profession = new Profession();
            profession.setName(user.getProfession());
            professionMapper.addProfession(profession);
            professionId = profession.getId();
        }
        String professionStr = "";
        if (professionId < 10) {
            professionStr = "0" + Integer.toString(professionId);
        } else {
            professionStr = Integer.toString(professionId);
        }
        Map<String, Object> condition = new HashMap<>();
        condition.put("profession", user.getProfession());
        condition.put("grade", user.getGrade());
        int num = studentMapper.checkCodeCount(condition) + 1;
        String str = "";
        if (num < 10) {
            str = "0" + Integer.toString(num);
        } else if (num < 100) {
            str = Integer.toString(num);
        }
        String no = "5" + user.getAdmissionTime().substring(user.getAdmissionTime().length()-2)
                + "3002" + professionStr + user.getGrade().substring(user.getGrade().length()-1) + str;
        user.setId(no);
        user.setUsername(no);
        user.setPassword("123456");
        studentMapper.addStudent(user);
    }

    @Override
    public void
    delete(List<String> ids) {
        studentMapper.delete(ids);
    }

    @Override
    public void update(User user) {
        studentMapper.update(user);
    }

    @Override
    public PagingResult<User> getStudentList(RowBounds rowBounds, Map<String, Object> condition) {
        PageRowBounds pageRowBounds = new PageRowBounds(rowBounds.getOffset(), rowBounds.getLimit());
        List<User> StudentInfoList = studentMapper.getStudentList(pageRowBounds, condition);
        return new PagingResult<>(StudentInfoList, pageRowBounds.getTotal());
    }
}
