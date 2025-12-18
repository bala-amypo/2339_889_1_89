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
    private LocalDateTime createdAt;

    public User(){

    }
    public User(Long id,String fullName,String email,String password,String ADMIN,String USER,LocalDateTime createdAt){
        this.id=id;
        this.fullName=fullname;
        this.email=email;
        this.password=password;
        this.ADMIN=ADMIN;
        this.USER=USER;
        this.createAt=createdAt;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long Id){
        this.id=id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String FullName){
        this.fullName=fullName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email=email;
    }
    
}