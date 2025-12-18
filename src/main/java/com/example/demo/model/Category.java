package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constranints.*;
@Category
@Table(name="Student")

public class Category(){
    private Long id;
    private String categoryName;
    private String description;
    private LocalDateTime createdAt;
    
    public Category(){

    }
    public Category(Long id,String categoryName,String description,LocalDateTime createdAt){
        this.id=id;
        this.categoryName=categoryName;
        this. description=description;
        this.createdAt=createdAt;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getcategoryName(){
        return categoryName;
    }
    public void setCategoryName(Long CategoryName){
        this.categoryName=categoryName;
    }
}
}