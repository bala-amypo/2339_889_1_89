package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Invoice;
import com.example.demo.repository.InvoiceRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.VendorRepository;
import com.example.demo.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private VendorRepository vendorRepository;

    @Override
    public Invoice uploadInvoice(Long userId, Long vendorId, Invoice invoice) {
        invoice.setUser(userRepository.findById(userId).orElse(null));
        invoice.setVendor(vendorRepository.findById(vendorId).orElse(null));
        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice categorizeInvoice(Long invoiceId) {
        return invoiceRepository.findById(invoiceId).orElse(null);
    }

    @Override
    public List<Invoice> getInvoicesByUser(Long userId) {
        return invoiceRepository.findByUserId(userId);
    }

    @Override
    public Invoice getInvoice(Long invoiceId) {
        return invoiceRepository.findById(invoiceId).orElse(null);
    }
}