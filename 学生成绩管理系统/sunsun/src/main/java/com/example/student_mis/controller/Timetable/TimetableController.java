package com.example.student_mis.controller.Timetable;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.student_mis.domain.CourseInfo;
import com.example.student_mis.domain.WeekCourse;
import com.example.student_mis.service.Timetable.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/4 18:48
 */
@RestController
@RequestMapping("/api/sms/timetable")
public class TimetableController {
    @Autowired
    private TimetableService timetableService;

    @PostMapping
    public void add(@RequestBody JSONArray WeekCourseList) {
        List<WeekCourse> list = JSONObject.parseArray(WeekCourseList.toJSONString(), WeekCourse.class);
        timetableService.add(list);
    }

    @GetMapping("/getTimetable")
    public List<WeekCourse> getStudentList (@RequestParam Map<String, Object> condition) {
        return timetableService.getTimetable(condition);
    }

    @GetMapping("/getTimetableByStudent")
    public List<WeekCourse> getTimetableByStudent (@RequestParam Map<String, Object> condition) {
        return timetableService.getTimetableByStudent(condition);
    }
    @GetMapping("/getTimetableByTeacher")
    public List<WeekCourse> getTimetableByTeacher (@RequestParam Map<String, Object> condition) {
        return timetableService.getTimetableByTeacher(condition);
    }
    @PostMapping("/updateCourseInfo")
    public void updateCourseInfo(@RequestBody CourseInfo courseInfo) {
        timetableService.updateCourseInfo(courseInfo);
    }
}
