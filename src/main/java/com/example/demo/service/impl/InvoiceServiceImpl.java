package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice;
import com.example.demo.repository.InvoiceRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.VendorRepository;
import com.example.demo.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final VendorRepository vendorRepository;
    private final UserRepository userRepository;

    // ✅ ONE constructor with ALL dependencies
    public InvoiceServiceImpl(
            InvoiceRepository invoiceRepository,
            VendorRepository vendorRepository,
            UserRepository userRepository) {

        this.invoiceRepository = invoiceRepository;
        this.vendorRepository = vendorRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Invoice categorizeInvoice(Long invoiceId) {
        return invoiceRepository.findById(invoiceId).orElse(null);
    }

    @Override
    public List<Invoice> getInvoiceByUser(Long userId) {
        return invoiceRepository.findByUser_Id(userId);
    }

    @Override
    public Invoice getInvoice(Long invoiceId) {
        return invoiceRepository.findById(invoiceId).orElse(null);
    }
}
