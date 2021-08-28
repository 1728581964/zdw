package com.example.student_mis.dao.Course;

import com.example.student_mis.dto.Course;
import com.github.pagehelper.PageRowBounds;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/1 15:09
 * 课程信息mapper层
 */
@Mapper
public interface CourseMapper {
    /**
     * description: 新增课程信息
     */
    void addCourse(Course course);

    /**
     * description: 删除课程信息
     * @param ids
     */
    void delete(@Param("ids") List<String> ids);

    /**
     * description: 修改课程信息
     */
    void update(Course course);
    /**
     * description: 获取课程信息
     */
    List<Course> getCourseList(PageRowBounds rowBounds, @Param("condition") Map<String, Object> condition);
    /**
     * description: 查看课程最大id
     */
    String checkCodeCount(@Param("condition") Map<String, Object> condition);
    /**
     * description: 根据专业、学期获取课程列表
     */
    List<Course> getCourseByMap(@Param("condition") Map<String, Object> condition);

    /**
     * description: 根据课程id获取课程信息
     */
    Course getCourseById(@Param("courseId") String courseId);
}
