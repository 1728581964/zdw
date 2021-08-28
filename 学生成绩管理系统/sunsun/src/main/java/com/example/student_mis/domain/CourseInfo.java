package com.example.student_mis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create by zhengdawei on 2021/6/1 14:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseInfo {

    private Integer id;//id

    private String courseId;//课程id

    private Integer start;//周数 start

    private Integer end;//周数 end

    private String room;//教室

    private String profession;//专业
}
