package com.xuanke.controller;

import com.xuanke.entity.Course;
import com.xuanke.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public List<Course> insertCourses(List<Course> list){
       return list;
    }
    @RequestMapping("/getCourseBycid")
    @ResponseBody
    public Course getCourseBycid(String cid){
      Course res=courseService.getCourseBycid(cid);
        System.out.println(res);
        return courseService.getCourseBycid("c9");
    }


}
