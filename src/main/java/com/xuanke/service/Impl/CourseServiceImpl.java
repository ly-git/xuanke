package com.xuanke.service.Impl;

import com.xuanke.entity.Course;
import com.xuanke.entity.CourseExample;
import com.xuanke.mapping.CourseMapper;
import com.xuanke.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> getAll() {
        return courseMapper.selectByExample(new CourseExample());
    }

    @Override
    public List<Course> getAllCourse() {
        return courseMapper.selectByExample(new CourseExample());
    }

    @Override
    public List<Course> insertCourses(Course course) {
        return null;
    }


//    @Override
//    public List<Course> insertCourses(String cid, Model model) {
//        CourseExample courseExample=new CourseExample();
//        List<Course> list=courseMapper.selectByExample(courseExample);
//        model.addAttribute("course",list);
//        return list;
//    }

    @Override
    public Course getCourseBycid(String cid) {
        return courseMapper.selectByPrimaryKey(cid);
    }


}
