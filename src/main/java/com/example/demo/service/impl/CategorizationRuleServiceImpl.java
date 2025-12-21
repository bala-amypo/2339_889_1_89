package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "categorization_rules")
public class CategorizationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(nullable = false)
    private String keyword;

    @Column(nullable = false)
    private String matchType;

    @Column(nullable = false)
    private Integer priority;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // ---------- CONSTRUCTORS ----------

    // Required by JPA
    public CategorizationRule() {
        this.createdAt = LocalDateTime.now();
    }

    public CategorizationRule(Category category, String keyword, String matchType, Integer priority) {
        this.category = category;
        this.keyword = keyword;
        this.matchType = matchType;
        this.priority = priority;
        this.createdAt = LocalDateTime.now();
    }

    // ---------- GETTERS ----------

    public Long getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getMatchType() {
        return matchType;
    }

    public Integer getPriority() {
        return priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // ---------- SETTERS ----------

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
