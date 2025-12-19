package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constranints.*;
import java.time.LocalDateTime;
@CategorizationRule
@Table(name="Student")

public class CategorizationRule{
    private Long id;
    private Category category;
    private String keyword;
    private Integer priority;
    private LocalDateTime createdAt;
    
    public CategorizationRule(){

    }
     public CategorizationRule(Long id,Category category,String keyword,Integer priority,LocalDateTime createdAt){
        this.id=id;
        this.category=category;
        this.keyword=keyword;
        this.priority=priority;
        this.createdAt=createdAt;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Category getCategory(){
        return category;
    }
    public void setCategory(Category category){
        this.category=category;
    }
    public String getKeyword(){
        return keyword;
    }
    public void setKeyword(String Keyword){
        this.keyword=keyword;
    }
    public Integer getPriority(){
        return priority;
    }
    public void setPriority(Integer priority){
        this.priority=priority;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
}

