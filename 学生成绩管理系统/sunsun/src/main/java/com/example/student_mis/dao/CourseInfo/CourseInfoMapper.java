package com.example.student_mis.dao.CourseInfo;

import com.example.student_mis.domain.CourseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/1 15:10
 * 课程具体安排表
 */
@Mapper
public interface CourseInfoMapper {
    /**
     * description: 新增课程具体安排（周数等）
     * @param: courseInfo
     */
    void addCourseInfo(CourseInfo courseInfo);
    /**
     * description: 修改课程具体安排（周数等）
     * @param: courseInfo
     */
    void updateCourseInfo(CourseInfo courseInfo);
    /**
     * description: 删除课程具体安排
     * @param: String
     */
    void deleteInfo(@Param("id") String id);
    /**
     * description: 获取课程信息详情
     * @param: Map<String, Object> condition
     * return: CourseInfo
     */
    CourseInfo getInfo(@Param("condition") Map<String, Object> condition);
}
