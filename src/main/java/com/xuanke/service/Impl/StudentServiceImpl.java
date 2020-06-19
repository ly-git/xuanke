package com.xuanke.service.Impl;

import com.xuanke.entity.Student;
import com.xuanke.entity.StudentExample;
import com.xuanke.mapping.StudentMapper;
import com.xuanke.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.selectByExample(new StudentExample());
    }

    @Override
    public Student getOneStudentBySid(String sid) {
        return studentMapper.selectByPrimaryKey(sid);
    }
}
