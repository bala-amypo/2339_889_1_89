package com.example.demo.service.impl;

import com.example.demo.model.Vendor;
import com.example.demo.repository.VendorRepository;
import com.example.demo.service.VendorService;
import com.example.demo.exception.ResourceNotFoundException;
import java.util.List;

public class VendorServiceImpl implements VendorService {

    private final VendorRepository repo;

    public VendorServiceImpl(VendorRepository repo) {
        this.repo = repo;
    }

    @Override
    public Vendor createVendor(Vendor vendor) {
        return repo.save(vendor);
    }

    @Override
    public Vendor getVendor(Long vendorId) {
        return repo.findById(vendorId)
        .orElseThrow(() -> new ResourceNotFoundException("Vendor not found"));
    }

    @Override
    public List<Vendor> getAllVendors() {
        return repo.findAll();
    }
}
