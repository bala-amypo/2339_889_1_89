
package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table(name="Student")

public class Invoice{
    @Id
    private Long id;
    
    private Vendor vendor;
    @Column (unique=true)
    private String invoiceNumber;
    @Positive
    private Double amount;
    private LocalDate invoiceDate;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User uploadedBy;
    private LocalDateTime uploadedAt;

    public Invoice(){

    }
    public Invoice(Long id,Vendor vendor,String invoiceNumber, Double amount,LocalDate invoiceDate,String description, Category category, User uploadedBy,LocalDateTime uploadedAt){
        this.id=id;
        this.vendor=vendor;
        this.invoiceNumber=invoiceNumber;
        this.amount=amount;
        this.invoiceDate=invoiceDate;
        this.description=description;
        this.category=category;
        this.uploadedBy=uploadedBy;
        this.uploadedAt=uploadedAt;
        }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Vendor getVendor(){
        return vendor;
    }
    public void setVendor(Vendor vendor){
        this.vendor=vendor;
    }
    public String getInvoiceNumber(){
        return invoiceNumber;
    }
    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber=invoiceNumber;
    }
    public Double getAmount(){
        return amount;
    }
    public void setAmount(Double amount){
        this.amount=amount;
    }
    public LocalDate getInvoiceDate(){
        return invoiceDate;
    }
    public void setInvoiceDate(LocalDate InvoiceDate ){
        this.invoiceDate=invoiceDate;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public Category getCategory(){
        return category;
    }
    public void setCategory(Category category){
        this.category=category;
    }
    public User getUploadedBy(){
        return uploadedBy;
    }
    public void setUploadedBy(User uploadedBy){
        this.uploadedBy=uploadedBy;
    }
    public LocalDateTime getUploadedAt(){
        return uploadedAt;
    }
    public void setUploadedAt(LocalDateTime uploadedAt){
        this.uploadedAt=uploadedAt;
    }
}
     


