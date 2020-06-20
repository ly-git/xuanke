package com.xuanke.controller;

import com.xuanke.entity.Course;
import com.xuanke.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin(origins = "*")
@Controller
public class CourseController {

    @Autowired
    CourseService courseService;


    @RequestMapping("/allCourses")
    @ResponseBody
    public List<Course> getAllCourses(){
        return courseService.getAllCourse();
    }

    @RequestMapping("/insertCourses")
    @ResponseBody
    public boolean insertCourses(Course course){
      int result=courseService.insertCourses(course);
      if(result==1){
          return true;
      }else{
          return false;
      }

    }
    @RequestMapping("/getCourseBycid")
    @ResponseBody
    public Course getCourseBycid(String courseId){
        return courseService.getCourseBycid(courseId );
    }


}
