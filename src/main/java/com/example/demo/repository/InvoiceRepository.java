package com.example.demo.repository;
import java.util.*;
import com.example.demo.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
     List<Invoice> findByUser_Id(Long userId);
}
