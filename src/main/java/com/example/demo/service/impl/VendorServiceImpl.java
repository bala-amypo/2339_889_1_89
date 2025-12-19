package com.example.demo.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Vendor;
import com.example.demo.repository.VendorRepository;
import com.example.demo.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService{

    @Autowired
    private VendorRepository vendorRepository;
    public VendorServiceImpl(VendorServiceRepository vendorRepository){
        this.vendorRepository=vendorRepository;
    }
    @Override
    public Vendor createVendor(Vendor vendor){
        return vendorRepository.save(vendor);
    }

    @Override
    public Vendor getVendor(Long vendorId){
        return vendorRepository.findById(vendorId).orElse(null);
    }

    @Override
    public List<Vendor> getAllVendors(){
        return VendorRepository.findAll();
    }
}