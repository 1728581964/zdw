package com.example.student_mis.dao.WeekCourse;

import com.example.student_mis.domain.WeekCourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/1 15:11
 * 课程表具体安排Mapper层
 */
@Mapper
public interface WeekCourseMapper {
    /**
     * description: 新增week表数据
     * @param weekCourse
     * @return void
     */
    void add(WeekCourse weekCourse);
    /**
     * description: 修改week表
     * @param: WeekCourse
     * return: void
     */
    void update(WeekCourse weekCourse);
    /**
     * description: 根据专业班级获取课程表信息
     * @param: condition
     * return: List<WeekCourse>
     */
    List<WeekCourse> getWeekCourse(@Param("condition") Map<String, Object> condition);

}
