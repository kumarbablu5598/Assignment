package com.example.mapping.model;

import lombok.Data;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;

@Data
@Entity
public class Laptop {


    @Id
    private String ID;
    private String name;
    private String brand;
    private Integer price;


    @OneToOne
    private Student student;


}
