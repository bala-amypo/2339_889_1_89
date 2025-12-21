package com.example.demo.model;

import jakarta.persistence.*;
import java.time.*;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Vendor vendor;

    @ManyToOne
    private User uploadedBy;

    @ManyToOne
    private Category category;

    private String description;

    // ✅ REQUIRED METHODS
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public void setUploadedBy(User user) {
        this.uploadedBy = user;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }
}
