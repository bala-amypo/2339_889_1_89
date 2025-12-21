
package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private String categoryName;

    private String description;
    
    private LocalDateTime createdAt;
    
    // This tells JPA that the 'category' field in the User class owns the relationship
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<User> users;

    public Category() {}

    public Category(Long id, String categoryName, String description, LocalDateTime createdAt) {
        this.id = id;
        this.categoryName = categoryName;
        this.description = description;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public List<User> getUsers() { return users; }
    public void setUsers(List<User> users) { this.users = users; }
}