package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constranints.*;
@Vendor
@Table(name="Student")

public class Vendor{
    private long id;
    private String vendorName;
    private String contactEmail;
    private String address;
    private LocalDateTime createdAt;
    pub
}