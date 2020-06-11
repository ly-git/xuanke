package com.xuanke.controller;

import com.xuanke.entity.Course;
import com.xuanke.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CourseController {

//    @Autowired
    CourseService courseService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/new")
    public ModelAndView method(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("new");
        mav.addObject("nums",100);
        return mav;
    }

    @RequestMapping("/all")
        @ResponseBody
        public List<Course> getAll () {
            return courseService.getAll();
        }

}
