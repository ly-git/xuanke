package com.xuanke.service;

import com.xuanke.entity.Course;
import org.springframework.ui.Model;

import java.util.List;

public interface CourseService {
     List<Course> getAll();

    List<Course> getAllCourse();

    int insertCourses(Course course);

    Course getCourseBycid(String courseId);
}
