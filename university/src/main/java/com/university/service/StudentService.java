package com.university.service;

import com.university.model.Students;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentService {
    private static List<Students> studentsList= new ArrayList<>();
    static {
        studentsList.add(new Students(10,"Bablu","Yadav",25,"It"));
        studentsList.add(new Students(20,"Anand","Rana",24,"cse"));
        studentsList.add(new Students(30,"Sintu","Kumar",26,"Ece"));
    }
    public List<Students> getAll(){
        return studentsList;

    }
    public  Students getStudentById(int id ){
        Students st= studentsList.get(id);
        return  st;
    }

    public void addStudent(Students studentdetails){
        studentsList.add(studentdetails);

    }
    public void deletebyId(int id){
        studentsList.remove(id);
    }
    public void updateById(int id,Students studentdetails){
        Students updatestudent = getStudentById(id);
        updatestudent.setFirstName(studentdetails.getFirstName());
        updatestudent.setLastName(studentdetails.getLastName());
        updatestudent.setDepartment(studentdetails.getDepartment());
        updatestudent.setAge(studentdetails.getAge());

    }
}
