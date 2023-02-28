package com.university.controller;

import com.university.model.Students;
import com.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getallstudent")
    public List<Students> getAllstudent(){
        return studentService.getAll();
    }
    @GetMapping("getstudent/{id}")
    public Students getStudent(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @PostMapping("/addstudent")
    public void addstudent(@RequestBody Students student){
     studentService.addStudent(student);
    }
    @DeleteMapping("/delete/{id}")
    public void deletestudnet(@PathVariable int id){
      studentService.deletebyId(id);

    }
    @PutMapping("/update")
    public void updateStudent(@PathVariable int id,@RequestBody Students student){
        studentService.updateById(id,student);
    }

}
