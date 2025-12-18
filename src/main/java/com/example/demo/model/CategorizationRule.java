package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constranints.*;
@CategorizationRule
@Table(name="Student")

public class CategorizationRule(){
    private Long id;
    private Category category;
    private String Keyword;
    private Integer priority;
    private LocalDateTime createdAt;
    
    public CategorizationRule(){

    }
     public Category(Long id,Category category,String Keyword,Integer priority,LocalDateTime createdAt){
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
    public void setCategoryName(String CategoryName){
        this.categoryName=categoryName;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
}

