package com.example.student_mis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create by zhengdawei on 2021/6/1 14:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {

    private String id;//id

    private String username;//用户名

    private String name;//课程名

    private String scoreByUser;//分数

    private String pointByUser;//绩点

    private String creditsByUser;//学分

    private Integer score;//总分

    private String credits;//学分

    private Integer term;//学期

    private Integer year;//届时

    private String no;//学号

    private String studentId;//学生账号id

    private String courseId;//课程id
}
