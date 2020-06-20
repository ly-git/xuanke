package com.xuanke.service.Impl;

import com.xuanke.entity.Course;
import com.xuanke.entity.CourseExample;
import com.xuanke.mapping.CourseMapper;
import com.xuanke.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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
    public int insertCourses(Course course) {
        return courseMapper.insert(course);
    }



    @Override
    public Course getCourseBycid(String courseId) {
        return courseMapper.selectByPrimaryKey(courseId);
    }


}
