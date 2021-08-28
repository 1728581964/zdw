package com.example.student_mis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create by zhengdawei on 2021/6/1 14:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeekCourse {

    private Integer id;//id

    private String monday;//周一

    private String tuesday;//周二

    private String wednesday;//周三

    private String thursday;//周四

    private String friday;//周五

    private String saturday;//周六

    private String sunday;//周日

    private String profession;//专业

    private String grade;//班级

    private Integer year;//学年

    private Integer term;//学期
}
