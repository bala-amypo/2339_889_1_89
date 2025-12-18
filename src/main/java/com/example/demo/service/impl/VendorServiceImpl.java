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
    private VendorRepository VendorRepository;

    @override
    public Vendor cjreateVendor(Vendor vendor){
        return VendorRepository.save(vendor);
    }

    @override
    public Vendor getVendor(Long vendorId){
        return VendorRepository.findById(vendorId).orelse(null);
    }
    @override
    public List<Vendor> getAllVendors(){
        return VendorRepository.findAll();
    }
}