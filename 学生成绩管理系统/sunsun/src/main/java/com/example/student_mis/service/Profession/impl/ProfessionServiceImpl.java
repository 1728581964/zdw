package com.example.student_mis.service.Profession.impl;

import com.example.student_mis.dao.Profession.ProfessionMapper;
import com.example.student_mis.domain.Profession;
import com.example.student_mis.service.Profession.ProfessionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Create by zhengdawei on 2021/6/4 18:40
 */
@Service
public class ProfessionServiceImpl implements ProfessionService {
    @Resource
    private ProfessionMapper professionMapper;

    @Override
    public List<Profession> getProfessionList() {
        return professionMapper.getProfessionList();
    }
}
