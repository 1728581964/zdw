package com.example.student_mis.service.Profession;

import com.example.student_mis.domain.Profession;

import java.util.List;

/**
 * Create by zhengdawei on 2021/6/4 18:26
 * 专业信息Service层
 */
public interface ProfessionService {
    /**
     * description: 获取专业
     * return:

     */
    List<Profession> getProfessionList();
}
