package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constranints.*;
@Vendor
@Table(name="Student")

public class Vendor{
    private Long id;
    @Column(unique=true)
    private String vendorName;
    @Email(message="Invalid fromat")
    private String contactEmail;
    private String address;
    @GeneratedValue(strategy=GeneratioType.AUTO)
    private LocalDateTime createdAt;
    public Vendor(){

    }
    public Vendor(Long id,String vendorName,String contactEmail,String address,LocalDateTime createdAt){
        this.id=id;
        this.vendorName=vendorName;
        this.contactEmail=contactEmail;
        this.address=address;
        this.createdAt=createdAt;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getVendorName(){
        return vendorName;
    }
    public void setVendorName(String vendorName){
        this.vendorName=vendorName;
    }
    public String getContactEmail(){
        return contactEmail;
    }
    public void setContactEmail(String contactEmail){
        this.contactEmail=contactEmail;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
}