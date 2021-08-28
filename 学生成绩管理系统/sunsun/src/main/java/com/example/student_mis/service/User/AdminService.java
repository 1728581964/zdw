package com.example.student_mis.service.User;

import com.example.student_mis.dto.User;
import com.example.student_mis.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/4 18:35
 * 管理员Service层
 */
public interface AdminService {
    /**
     * description: 新增学生账号
     * @param user
     * @return void
     */
    void add(User user);

    /**
     * description: 删除学生账号
     *
     * @param ids
     * @return void
     */
    void delete(List<Integer> ids);

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
    PagingResult<User> getAdminList(RowBounds rowBounds, Map<String, Object> condition);

}
