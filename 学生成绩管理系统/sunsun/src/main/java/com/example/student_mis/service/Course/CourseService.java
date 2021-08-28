package com.example.student_mis.service.Course;

import com.example.student_mis.dto.Course;
import com.example.student_mis.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/1 15:45
 * 课程信息service层
 */
public interface CourseService {
    /**
     * description: 新增课程信息
     * @param course
     * return void
     */
    void addCourse(Course course);
    /**
     * description: 删除课程信息
     *
     * @param ids
     * @return void
     */
    void delete(List<String> ids);

    /**
     * description: 修改课程信息
     *
     * @param course
     * @return void
     */
    void update(Course course);
    /**
     * description: 查询课程信息
     * @param: rowBounds
     * @param: condition
     */
    PagingResult<Course> getCourseList(RowBounds rowBounds, Map<String, Object> condition);
    /**
     * description: 根据专业、学期获取课程列表
     * @param:  Map<String, Object> condition
     * return: List<Course>
     */
    List<Course> getCourseByMap(Map<String, Object> condition);
}
