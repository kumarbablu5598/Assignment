package com.example.mapping.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {

    @Id
    private String ID;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @Embedded
    private Address address;
//
//    @JsonIgnore
//    @OneToOne(cascade = CascadeType.ALL)
//    private Laptop laptop;
//    @JsonIgnore
//    @OneToMany(mappedBy = "student")
//    List<Book> bookList = new ArrayList<>();

//    @JsonIgnore
//    @ManyToMany(mappedBy = "studentList")
//    List<Course> courseList = new ArrayList<>();

}
