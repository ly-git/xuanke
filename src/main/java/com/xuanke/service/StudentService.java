package com.xuanke.service;

import com.xuanke.entity.Student;

import java.util.List;

public interface StudentService {

  List<Student> getAllStudent();

  Student getOneStudentBySid(String sid);

}
