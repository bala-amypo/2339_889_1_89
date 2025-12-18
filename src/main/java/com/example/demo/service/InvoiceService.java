package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Invoice;

public interface InvoiceService{
    Invoice unloadInvoice(long userId,Long vendorId,Invoice invoice);
    Invoice CategorizeInvoice(Long invoiceId);
    List<Invoice> getInvoicesByUser(Long userId);
    Invoice getInvoice(Long invoiceId);
}