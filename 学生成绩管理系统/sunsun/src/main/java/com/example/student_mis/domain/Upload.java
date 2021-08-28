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
public class Upload {

    private Integer id;//id

    private String userId;//用户id

    private Integer level;//用户等级

    private String url;//存储地址
}
