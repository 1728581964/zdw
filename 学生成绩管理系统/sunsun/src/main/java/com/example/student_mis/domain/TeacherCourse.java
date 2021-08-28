package com.example.student_mis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create by zhengdawei on 2021/6/1 14:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherCourse {

    private Integer id;//id

    private String teacherId;//教师id

    private String username;//教师用户名

    private String name;//课程名

    private String profession;//专业

    private String grade;//班级

    private Integer term;//学期

    private Integer number;//节数

    private String realName;//教师姓名

    private String courseId;//课程id

    private String credits;//学分

    private Integer type;//类型

    private Integer start;//开始时间

    private Integer end;//结束时间

    private Integer room;//教室
}
