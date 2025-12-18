package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constranints.*;
@Invoice
@Table(name="Student")

public class Invoice(){
    private Long id;
    private Vendor vendor;
    private String invoiceNumber;
    private Double amount;
    private LocalDate invoiceDate;
    private String description;
    private Category category;
    
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
    public void setId(Long id){
        this.id=id;
    }
    public String getFullName(){
        return full