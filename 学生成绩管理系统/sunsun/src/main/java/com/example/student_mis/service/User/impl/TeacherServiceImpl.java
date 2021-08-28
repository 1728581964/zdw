package com.example.student_mis.service.User.impl;

import com.example.student_mis.dao.User.TeacherMapper;
import com.example.student_mis.dto.User;
import com.example.student_mis.service.User.TeacherService;
import com.example.student_mis.utils.PagingResult;
import com.github.pagehelper.PageRowBounds;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/4 18:45
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public void addTeacher(User user) {
        int num = teacherMapper.checkCodeCount();
        String str = "";
        if (num < 10) {
            str = "00" + Integer.toString(num);
        } else if (num < 100) {
            str = "0" + Integer.toString(num);
        } else {
            str = Integer.toString(num);
        }
        String no = "389"+str+user.getSex().toString();
        user.setUsername(no);
        user.setId(no);
        user.setPassword("123456");
        teacherMapper.addTeacher(user);
    }

    @Override
    public void delete(List<Integer> ids) {
        teacherMapper.delete(ids);
    }

    @Override
    public void update(User user) {
        teacherMapper.update(user);
    }

    @Override
    public PagingResult<User> getTeacherList(RowBounds rowBounds, Map<String, Object> condition) {
        PageRowBounds pageRowBounds = new PageRowBounds(rowBounds.getOffset(), rowBounds.getLimit());
        List<User> TeacherInfoList = teacherMapper.getTeacherList(pageRowBounds, condition);
        return new PagingResult<>(TeacherInfoList, pageRowBounds.getTotal());
    }
}
