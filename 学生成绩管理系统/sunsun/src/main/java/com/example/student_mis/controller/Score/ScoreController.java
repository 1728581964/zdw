package com.example.student_mis.controller.Score;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.student_mis.dto.Course;
import com.example.student_mis.dto.Score;
import com.example.student_mis.service.Score.ScoreService;
import com.example.student_mis.utils.PagingResult;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/4 18:47
 */
//注解
@RestController
@RequestMapping("/api/sms/score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping("/getCourseList")
    public PagingResult<Course> getCourseList (@RequestParam Map<String,Object> condition,
                                               @RequestParam(required = false, name = "$limit", defaultValue = "10") Integer limit,
                                               @RequestParam(required = false, name = "$offset", defaultValue = "0") Integer offset){
        RowBounds rowBounds = new RowBounds(offset, limit);
        return scoreService.getCourseList(rowBounds, condition);
    }
    @PostMapping
    private void addEntry(@RequestBody JSONArray UserScore) {
        List<Score> list = JSONObject.parseArray(UserScore.toJSONString(), Score.class);
        scoreService.addEntry(list);
    }
    @GetMapping("/export")
    public List<Course> getExportList (@RequestParam Map<String, Object> condition) {
        return scoreService.getExportList(condition);
    }
    @GetMapping("/getUserNum")
    public List<Map<String, Object>> getUserNum (@RequestParam Map<String, Object> condition) {
        return scoreService.getUserNum(condition);
    }

    @GetMapping("/getUserTotal")
    public Map<String, Object> getUserTotal (@RequestParam Map<String, Object> condition) {
        return scoreService.getUserTotal(condition);
    }
}
