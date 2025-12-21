package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String password;
    private String role;
    private LocalDateTime createdAt = LocalDateTime.now();

    // ✅ GETTERS & SETTERS
    public Long getId() { return id; }
    public String getEmail() { return email; }
    public void setRole(String role) { this.role = role; }
}
