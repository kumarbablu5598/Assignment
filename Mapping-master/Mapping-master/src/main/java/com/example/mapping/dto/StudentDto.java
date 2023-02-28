package com.example.mapping.dto;

import com.example.mapping.model.Address;
import lombok.Builder;
import lombok.Data;

@Data
//@Builder
public class StudentDto {

    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;
    private Address address;

}
