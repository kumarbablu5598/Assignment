package com.example.mapping.controller;

import com.example.mapping.dto.BookDto;
import com.example.mapping.exception.RecordNotFound;
import com.example.mapping.model.Book;
import com.example.mapping.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")

public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody BookDto book) throws RecordNotFound {
        Book __book =  bookService.addBook(book);
        return __book;
    }

    @GetMapping("/{bookId}")
    public Book getBook(@PathVariable String bookId) throws RecordNotFound {
        Book __book  = bookService.findByBook(bookId);
        return __book;
    }


    @GetMapping
    public List<Book> getAllBook(){
        List<Book> allBook = bookService.findAllBook();
        return allBook;
    }

    @GetMapping("/student/{studentID}")
    public List<Book> getAllBook(@PathVariable(value = "studentID") String studentID) throws RecordNotFound {
        List<Book> allBook = bookService.findAllBookByStudentId(studentID);
        return allBook;
    }

}