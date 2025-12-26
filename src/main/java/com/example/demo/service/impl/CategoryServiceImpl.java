package com.example.demo.service.impl;

import com.example.demo.model.Invoice;
import com.example.demo.model.Category;
import com.example.demo.model.CategorizationRule;
import com.example.demo.service.CategorizationService;
import com.example.demo.repository.CategorizationRuleRepository;
import com.example.demo.util.InvoiceCategorizationEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategorizationService {
    
    @Autowired
    private CategorizationRuleRepository ruleRepository;
    
    @Autowired
    private InvoiceCategorization engine;
    
    @Override
    public Category categorizeInvoice(Invoice invoice) {
        if (invoice.getDescription() == null) {
            return null;
        }
        
        List<CategorizationRule> rules = ruleRepository.findMatchingRulesByDescription(invoice.getDescription());
        return engine.determineCategory(invoice, rules);
    }
    
    @Override
    public List<CategorizationRule> findMatchingRules(String description) {
        return ruleRepository.findMatchingRulesByDescription(description);
    }
    
    @Override
    public Category testCategorization(String description) {
        Invoice testInvoice = new Invoice();
        testInvoice.setDescription(description);
        return categorizeInvoice(testInvoice);
    }
}