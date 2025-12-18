package com.example.demo.service.impl;
import java.util.List;
import org.springfraework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Category;
import com.example.demo.entity.repository.CategoryRepository;
import com.example.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

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