package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constranints.*;
@Category
@Table(name="Student")

public class Category(){
    private Long id;
    private String categoryName;
    private String description;
    private Lov
}