package com.example.student_mis.service.Course.impl;

import com.example.student_mis.dao.Course.CourseMapper;
import com.example.student_mis.dao.CourseInfo.CourseInfoMapper;
import com.example.student_mis.dao.Profession.ProfessionMapper;
import com.example.student_mis.domain.CourseInfo;
import com.example.student_mis.domain.Profession;
import com.example.student_mis.dto.Course;
import com.example.student_mis.service.Course.CourseService;
import com.example.student_mis.utils.PagingResult;
import com.github.pagehelper.PageRowBounds;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
/**
 * Create by zhengdawei on 2021/6/1 15:55
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;
    @Resource
    private CourseInfoMapper courseInfoMapper;
    @Resource
    private ProfessionMapper professionMapper;

    @Override
    public void addCourse(Course course) {
        Profession profession =  professionMapper.getProfessionIdByName(course.getProfession());
        String id = "";
        String str = course.getYear().toString() + "0" + profession.getId() + course.getTerm();
        Map<String, Object> condition = new HashMap<>();
        condition.put("profession", course.getProfession());
        condition.put("year", course.getYear());
        String value = courseMapper.checkCodeCount(condition);
        String strValue = "";
        if (value != null) {
            int num = Integer.parseInt(value.substring(7)) + 1;
            if (num < 10) {
                strValue =  "00" + Integer.toString(num);
            } else if (num < 100) {
                strValue = "0" + Integer.toString(num);
            } else {
                strValue = Integer.toString(num);
            }
        } else {
            strValue = "001";
        }
        id = str + strValue;
        course.setId(id);
        courseMapper.addCourse(course);

        courseInfoMapper.deleteInfo(id);
        // 新增课程的周数等
        CourseInfo courseInfo = new CourseInfo();
        courseInfo.setStart(1);
        courseInfo.setEnd(25);
        courseInfo.setCourseId(id);
        courseInfo.setProfession(course.getProfession());
        courseInfoMapper.addCourseInfo(courseInfo);
    }

    @Override
    public void delete(List<String> ids) {
        courseMapper.delete(ids);
        for (String id : ids) {
            courseInfoMapper.deleteInfo(id);
        }
    }

    @Override
    public void update(Course course) {
        courseMapper.update(course);
        CourseInfo courseInfo = new CourseInfo();
        courseInfo.setProfession(course.getProfession());
        courseInfo.setCourseId(course.getId());
        courseInfoMapper.updateCourseInfo(courseInfo);
    }

    @Override
    public PagingResult<Course> getCourseList(RowBounds rowBounds, Map<String, Object> condition) {
        PageRowBounds pageRowBounds = new PageRowBounds(rowBounds.getOffset(), rowBounds.getLimit());
        List<Course> CourseList = courseMapper.getCourseList(pageRowBounds, condition);
        return new PagingResult<>(CourseList, pageRowBounds.getTotal());
    }

    @Override
    public List<Course> getCourseByMap(Map<String, Object> condition) {
        return courseMapper.getCourseByMap(condition);
    }

}
