package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
@Entity
@Table(name="user")


public class User{
    @Id
    private Long id;
    private String fullName;
    @Column(unique=true)
    private String email;
    @Size(min=8)
    private String password;
    
    public User(Long id, String fullName, String email, @Size(min = 8) String password, String aDMIN, String uSER,LocalDateTime createdAt) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        ADMIN = aDMIN;
        USER = uSER;
        this.createdAt = createdAt;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getADMIN() {
        return ADMIN;
    }

    public void setADMIN(String aDMIN) {
        ADMIN = aDMIN;
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String uSER) {
        USER = uSER;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    private String ADMIN;
    private String USER;
    @GeneratedValue(strategy=GenerationType.AUTO)
    private LocalDateTime createdAt;

    public User(){

    }
}