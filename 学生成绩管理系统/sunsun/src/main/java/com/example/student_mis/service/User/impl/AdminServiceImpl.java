package com.example.student_mis.service.User.impl;

import com.example.student_mis.dao.User.AdminMapper;
import com.example.student_mis.dto.User;
import com.example.student_mis.service.User.AdminService;
import com.example.student_mis.utils.PagingResult;
import com.github.pagehelper.PageRowBounds;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/4 18:44
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    @Override
    public void add(User user) {
        int num = adminMapper.checkCodeCount();
        String username = "990216" + Integer.toString(num);
        user.setUsername(username);
        user.setPassword("password");
        adminMapper.add(user);
    }

    @Override
    public void
    delete(List<Integer> ids) {
        adminMapper.delete(ids);
    }

    @Override
    public void update(User user) {
        adminMapper.update(user);
    }

    @Override
    public PagingResult<User> getAdminList(RowBounds rowBounds, Map<String, Object> condition) {
        PageRowBounds pageRowBounds = new PageRowBounds(rowBounds.getOffset(), rowBounds.getLimit());
        List<User> StudentInfoList = adminMapper.getAdminList(pageRowBounds, condition);
        return new PagingResult<>(StudentInfoList, pageRowBounds.getTotal());
    }
}
