package com.example.mapping.service;


import com.example.mapping.dto.CourseDto;
import com.example.mapping.dto.CourseStudentDto;
import com.example.mapping.exception.RecordNotFound;
import com.example.mapping.model.Course;
import com.example.mapping.model.Student;
import com.example.mapping.repo.CourseRepo;
import com.example.mapping.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepo studentRepo;

    public Course addCourse(CourseDto courseDto) {
        String ID = UUID.randomUUID().toString();

        Course course = new Course();
        course.setID(ID);
        course.setTitle(courseDto.getTitle());
        course.setDuration(courseDto.getDuration());
        course.setDescription(courseDto.getDescription());
        Course __course = courseRepo.save(course);
        return __course;
    }

    public Course findByCourse(String courseId) throws RecordNotFound {
        Optional<Course> courseOptional = courseRepo.findById(courseId);

        if(courseOptional.isPresent())
            return courseOptional.get();
        throw new RecordNotFound("Course Not Found By Id "+courseId);

    }

    public List<Course> findAllCourse() {
        List<Course> courseRepoAll = courseRepo.findAll();
        return courseRepoAll;
    }

    public Course addCourseToStudent(CourseStudentDto course) throws RecordNotFound {
        Student byStudent = studentService.findByStudent(course.getStudentId());

        Optional<Course> optionalCourse = courseRepo.findById(course.getCourseId());
        if(optionalCourse.isPresent()){

            Course course1 = optionalCourse.get();
            List<Student> studentList = new ArrayList<>();

            studentList.add(byStudent);
            course1.setStudentList(studentList);
            Course save = courseRepo.save(course1);
            return save;
        }
        return null;
    }

    public void addStudentToCourse(String studentId, String courseId) throws RecordNotFound {
        Optional<Course> optionalCourse = this.courseRepo.findById(courseId);


        if(optionalCourse.isPresent()){
            Student student = this.studentService.findByStudent(studentId);

            Course course = optionalCourse.get();
            List<Student> studentList = course.getStudentList();
            studentList.add(student);
            courseRepo.save(course);

        }

    }
}

