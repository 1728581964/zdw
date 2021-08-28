package com.example.student_mis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Create by zhengdawei on 2021/6/1 14:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;//id

    private String username;//用户名

    private String password;//密码

    private String passwordAgain;//确认密码

    private String realName;//真实姓名

    private Integer level;//等级

    private String school;//学校

    private String admissionTime;//入学时间

    private String email;//电子邮箱

    private String profession;//专业

    private String phone;//联系电话

    private Integer sex;//性别

    private String grade;//班级

    private Date createTime;//创建时间

    private String token;//token

    private String refreshToken;//refreshToken

    private Integer state;//默哀模式
}
