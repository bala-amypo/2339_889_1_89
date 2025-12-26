package com.example.demo.service.impl;

import com.example.demo.model.Vendor;
import com.example.demo.repository.VendorRepository;
import com.example.demo.service.VendorService;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceImpl implements VendorService {
    private final VendorRepository vendorRepository;
    
    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }
    
    @Override
    public Vendor createVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }
}