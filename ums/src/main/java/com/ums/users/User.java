package com.ums.users;

public class User {
    private  int UserId;
    private String Name;
    private String UserName;
    private String Address;
    private String Number;

    public User(int userId, String name, String userName, String address, String number) {
        UserId = userId;
        Name = name;
        UserName = userName;
        Address = address;
        Number = number;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", Name='" + Name + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Address='" + Address + '\'' +
                ", Number='" + Number + '\'' +
                '}';
    }
}
