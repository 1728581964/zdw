package com.example.student_mis.controller.Profession;

import com.example.student_mis.domain.Profession;
import com.example.student_mis.service.Profession.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create by zhengdawei on 2021/6/4 18:47
 */
@RestController
@RequestMapping("/api/sms/profession")
public class ProfessionController {
    @Autowired
    private ProfessionService professionService;

    @GetMapping("/getProfessionList")
    private List<Profession> getProfessionList () {
        return professionService.getProfessionList();
    }
}
