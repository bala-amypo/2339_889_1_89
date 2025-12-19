package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constranints.*;
import java.time.LocalDateTime;
@Category
@Table(name="Student")

public class Category{
    private Long id;
    @Column(unique=true)
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
    public String getCategoryName(){
        return categoryName;
    }
    public void setCategoryName(String categoryName){
        this.categoryName=categoryName;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt( LocalDateTime getCreatedAt){
        this.createdAt=createdAt;
    }

}
