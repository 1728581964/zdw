package com.example.student_mis.service.Score;

import com.example.student_mis.dto.Course;
import com.example.student_mis.dto.Score;
import com.example.student_mis.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/4 18:26
 * 分数信息Service类
 */
public interface ScoreService {
    /**
     * description: 根据班级等信息获取课程信息
     * @param rowBounds
     * @param condition
     */
    PagingResult<Course> getCourseList(RowBounds rowBounds, Map<String, Object> condition);
    /**
     * description: 录入成绩
     * @param: List<Score>
     * return: void
     */
    void addEntry(List<Score> list);
    /**
     * description: 导出成绩到Excel
     * @param: Map<String, Object> condition
     * return: List<Course>
     */
    List<Course> getExportList(Map<String, Object> condition);
    /**
     * description: 根据成绩划分等级（不及格、及格、优秀）
     * @param: Map<String, Object> condition
     * return: List<Map<String, Object>>
     */
    List<Map<String, Object>> getUserNum(Map<String, Object> condition);
    /**
     * description: 学生用户根据id获取总学分和总绩点
     * @param: Map<String, Object> condition
     * return: Map<String, Object>
     */
    Map<String, Object> getUserTotal(Map<String, Object> condition);
}
