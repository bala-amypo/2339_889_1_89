package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class CategorizationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Category category;

    private String keyword;
    private String matchType; // EXACT / CONTAINS / REGEX
    private Integer priority;

    private LocalDateTime createdAt = LocalDateTime.now();

    // ✅ GETTERS (REQUIRED)
    public String getMatchType() {
        return matchType;
    }

    public String getKeyword() {
        return keyword;
    }

    public Integer getPriority() {
        return priority;
    }

    public Category getCategory() {
        return category;
    }
}
