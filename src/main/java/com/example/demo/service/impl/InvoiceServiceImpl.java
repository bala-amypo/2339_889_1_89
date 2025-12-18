package com.example.demo.service.impl;
import java.util.List;
import org.springfraework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Invoice;
import com.example.demo.entity.repository.InvoiceRepository;
import com.example.demo.entity.repository.UserRepository;
import com.example.demo.entity.repository.VendorRepository;
import com.example.demo.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService{

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private VendorRepository VendorRepository;

    @override
    public Invoice uploadInvoice(Long userId,Long vendorId,Invoice invoice){
        Invoice.setUser(Long userId,Long vendorId,Invoice invoice){

        return categoryRepository.save(category);
    }

    @override
    public Category getCategory(Long id){
        return categoryRepository.findById(id).orElse(null);
    }

    @override
    public List<Category> getAllCategories(){
        return CategoryRepository.findAll();
    }
}