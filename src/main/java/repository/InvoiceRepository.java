package com.example.demo.repository;

import com.example.demo.model.InvoiceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<InvoiceRepository, Long> {

}