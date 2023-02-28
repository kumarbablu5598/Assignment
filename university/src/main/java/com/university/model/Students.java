package com.university.model;

public class Students {
    private  int StudentId;
    private String firstName;
    private String lastName;
    private int age;
    private String department;

    public Students() {
    }

    public Students(int studentId, String firstName, String lastName, int age, String department) {
        StudentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
