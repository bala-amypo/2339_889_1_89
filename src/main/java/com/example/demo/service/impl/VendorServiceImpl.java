package com.example.demo.service.impl;
import java.util.List;
import org.springfraework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Vendor;
import com.example.demo.entity.repository.VendorRepository;
import com.example.demo.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService{

    @Autowired
    private VendorRepository vendorRepository;

    @override
    public Vendor createVendor(Vendor vendor){
        return vendorRepository.save(vendor);
    }

    @override
    public Vendor getVendor(Long vendorId){
        return vendorRepository.findById(vendorId).orElse(null);
    }

    @override
    public List<Vendor> getAllVendors(){
        return VendorRepository.findAll();
    }
}