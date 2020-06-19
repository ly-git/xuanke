package com.xuanke.controller;

import com.xuanke.entity.Student;
import com.xuanke.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin(origins = "*")
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/allStudent")
    @ResponseBody
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @RequestMapping("/getOneStudent")
    @ResponseBody
    public Student getStudent(String sid){
       return studentService.getOneStudentBySid("1950212703");


    }
}
