package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constranints.*;
@User
@Table(name="Student")

public class User(){
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private String ADMIN;
    private String USER;
    private LocalDateTime createAt;

    public User(){

    }
    public User(Long id,String fullName,String email,String password,String ADMIN,String USER,LocalDateTime createAt){
        this.id=id;
    private String fullName;
    private String email;
    private String password;
    private String ADMIN;
    private String USER;
    private LocalDateTime createAt;
    }
}