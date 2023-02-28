package com.userms.model;
import java.time.LocalDate;
import java.time.LocalTime;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="table_user")
public class Users {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="userid")
    private int UserId;

    @NonNull
    @Column(name="username")
    private String username;

    @Column(name="dateOdBirth")
    private String DateOfBirth;

    @Column(name="email")
    private String email;

    @Column(name="phoneNumber")
    private String Phone_Number;

    @Column(name="date")
    private LocalDate Date ;

    @Column(name="time")
    private LocalTime Time;

}
