package com.example.student_mis.service.User;

import com.example.student_mis.dto.User;
import com.example.student_mis.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/4 18:35
 * 学生用户接口
 */
public interface StudentService {
    /**
     * description: 新增学生账号
     * @param user
     * @return void
     */
    void addStudent(User user);

    /**
     * description: 删除学生账号
     *
     * @param ids
     * @return void
     */
    void delete(List<String> ids);

    /**
     * description: 修改学生账号
     *
     * @param user
     * @return void
     */
    void update(User user);

    /**
     * description: 获取学生账号信息列表
     * @param rowBounds
     * @param condition
     */
    PagingResult<User> getStudentList(RowBounds rowBounds, Map<String, Object> condition);

}
