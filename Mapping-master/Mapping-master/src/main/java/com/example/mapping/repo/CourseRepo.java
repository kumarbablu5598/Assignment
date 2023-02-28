package com.example.mapping.repo;

import com.example.mapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,String> {
}