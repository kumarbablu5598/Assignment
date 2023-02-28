package com.example.mapping.controller;

import com.example.mapping.dto.StudentDto;
import com.example.mapping.exception.RecordNotFound;
import com.example.mapping.model.Student;
import com.example.mapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")

public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody StudentDto student){
      Student __student =  studentService.addStudent(student);
        return __student;
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable String studentId) throws RecordNotFound {
       Student __student  = studentService.findByStudent(studentId);
        return __student;
    }


    @GetMapping
    public List<Student>  getAllStudent(){
        List<Student> allStudent = studentService.findAllStudent();
        return allStudent;
    }
}
