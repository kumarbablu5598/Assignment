package com.example.mapping.dto;

import com.example.mapping.model.Student;
import lombok.Data;

import javax.persistence.ManyToOne;

@Data
public class BookDto {


    private String title;
    private String author;
    private String description;
    private String price;
    private String studentID;
}
