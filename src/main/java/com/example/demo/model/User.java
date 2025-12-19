package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
@Model
@Table(name="Student")

public class User{
    private Long id;
    private String fullName;
    @Column(unique=true)
    private String email;
    @size(min=8)
    private String password;
    private String ADMIN;
    private String USER;
    @GeneratedValue(strategy=GenerationType.AUTO)
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
    public void setId(Long id){
        this.id=id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getadmin(){
        return ADMIN;
    }
    public void setadmin(String ADMIN){
        this.ADMIN=ADMIN;
    }
    public String getuser(){
        return USER;
    }
    public void setuser(String USER){
        this.USER=USER;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
}