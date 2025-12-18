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
    private User uploadedBy;
    private LocalDateTime uploadedAt;

    public Invoice(){

    }
    public Invoice(Long id,Vendor vendor,String invoiceNumber, Double amount,LocalDate invoiceDate,String description, Category category, User uploadedBy,LocalDateTime uploadedAt){
        this.id=id;
        this.vendor=vendor;
        this.invoiceNumber=invoiceNumber;
        this.amount=amount;
        this.invoiceDate=invoiceDate;
        this.description=description;
        this.category;
        private User uploadedBy;
        private LocalDateTime uploadedAt;
        }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getFullName(){
        return full