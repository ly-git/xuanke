package com.xuanke.service;

import com.xuanke.entity.Course;

import java.util.List;

public interface CourseService {
     List<Course> getAll();

    List<Course> getAllCourse();

    List<Course> insertCourses(Course course);

    Course getCourseBycid(String cid);
}
