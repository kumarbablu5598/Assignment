package com.example.mapping.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Book {

    @Id

    private String ID;

    private String title;
    private String author;
    private String description;
    private String price;


    @ManyToOne
    private Student student;




}
