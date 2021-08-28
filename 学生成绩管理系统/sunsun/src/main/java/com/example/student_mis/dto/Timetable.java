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
public class Timetable {

    private Integer id;//id

    private Integer weekId;//week id

    private String profession;//专业

    private String grade;//班级

    private Integer year;//学年

    private Integer term;//学期

}
