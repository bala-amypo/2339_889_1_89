
package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CategorizationRule;
import com.example.demo.repository.CategorizationRuleRepository;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategorizationRuleService;

@Service
public class CategorizationRuleServiceImpl implements CategorizationRuleService {

    private final CategorizationRuleRepository rep;
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategorizationRuleServiceImpl(
            CategorizationRuleRepository rep,
            CategoryRepository categoryRepository) {
        this.rep = rep;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategorizationRule createRule(Long categoryId, CategorizationRule rule) {
        rule.setCategory(categoryRepository.findById(categoryId).orElse(null));
        return rep.save(rule);
    }

    @Override
    public List<CategorizationRule> getRulesByCategory(Long categoryId) {
        return rep.findByCategoryId(categoryId);
    }

    @Override
    public void deleteRule(Long ruleId) {
        rep.deleteById(ruleId);
    }
}





package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice;
import com.example.demo.repository.InvoiceRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.VendorRepository;
import com.example.demo.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;
    public InvoiceServiceImpl(InvoiceRepository invoiceRepository){
        this.invoiceRepository=invoiceRepository;
    }
    @Autowired
    private VendorRepository vendorRepository;
    public InvoiceServiceImpl(VendorRepository vendorRepository){
        this.vendorRepository=vendorRepository;
    }
    @Autowired
    private UserRepository userRepository;
    public InvoiceServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    // @Override
    // public Invoice uploadInvoice(Long userId, Long vendorId, Invoice invoice) {
    //     invoice.setUSER(userRepository.findById(userId).orElse(null));
    //     invoice.setVendor(vendorRepository.findById(vendorId).orElse(null));
    //     return invoiceRepository.save(invoice);
    // }

    @Override
    public Invoice categorizeInvoice(Long invoiceId) {
        return invoiceRepository.findById(invoiceId).orElse(null);
    }

    @Override
    public List<Invoice> getInvoiceByUser(Long userId) {
        return invoiceRepository.findByUserId(userId);
    }

    @Override
    public Invoice getInvoice(Long invoiceId) {
        return invoiceRepository.findById(invoiceId).orElse(null);
    }
}





package com.example.demo.service.impl;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public User registerUser(User user){
        return userRepository.save(user);
    }
    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @Override
    public Optional<User> findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}


package com.example.demo.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Vendor;
import com.example.demo.repository.VendorRepository;
import com.example.demo.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {
    @Autowired
    private final VendorRepository vendorRepository;
    public VendorServiceImpl(VendorRepository vendorRepository){
        this.vendorRepository=vendorRepository;
    }

    @Override
    public Vendor createVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public Vendor getVendor(Long vendorId) {
        return vendorRepository.findById(vendorId).orElse(null);
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
