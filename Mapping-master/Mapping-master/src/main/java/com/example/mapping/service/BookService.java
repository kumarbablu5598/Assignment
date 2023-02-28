package com.example.mapping.service;

import com.example.mapping.dto.BookDto;
import com.example.mapping.exception.RecordNotFound;
import com.example.mapping.model.Book;
import com.example.mapping.model.Student;
import com.example.mapping.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private StudentService studentService;

    public Book addBook(BookDto bookDto) throws RecordNotFound {
        String ID = UUID.randomUUID().toString();

        Student byStudent = studentService.findByStudent(bookDto.getStudentID());
        Book book = new Book();
        book.setAuthor(bookDto.getAuthor());
        book.setTitle(bookDto.getTitle());
        book.setPrice(bookDto.getPrice());
        book.setStudent(byStudent);
        book.setDescription(book.getDescription());
        book.setID(ID);
        Book __book = bookRepo.save(book);
        return __book;
    }

    public List<Book> findAllBookByStudentId(String studentID) throws RecordNotFound {
        Student byStudent = studentService.findByStudent(studentID);
        List<Book> allBookByStudent = bookRepo.findAllBookByStudent(byStudent);
        for(Book b:allBookByStudent){
            b.setStudent(null);
        }
        return allBookByStudent;
    }


    public Book findByBook(String bookId) throws RecordNotFound {
        Optional<Book> bookOptional = bookRepo.findById(bookId);

        if(bookOptional.isPresent())
            return bookOptional.get();
        throw new RecordNotFound("Book Not Found By Id "+bookId);

    }

    public List<Book> findAllBook() {
        List<Book> bookRepoAll = bookRepo.findAll();
        return bookRepoAll;
    }
}
