package com.example.mapping.repo;

import com.example.mapping.model.Book;
import com.example.mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,String> {


    List<Book> findAllBookByStudent(Student student);


//    @Query("SELECT * FROM")
//    List<Book> getBook();

}
