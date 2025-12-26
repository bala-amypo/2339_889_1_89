package com.example.demo.controller;

import com.example.demo.model.CategorizationRule;
import com.example.demo.model.Category;
import com.example.demo.service.impl.CategorizationRuleServiceImpl;
import com.example.demo.util.InvoiceCategorizationEngine;
import com.example.demo.repository.CategorizationRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/categorization-rules")
public class CategorizationRuleController {

    @Autowired
    private CategorizationRuleServiceImpl ruleService;
    
    @Autowired
    private CategorizationRuleRepository ruleRepository;
    
    @Autowired
    private InvoiceCategorizationEngine engine;

    @PostMapping
    public ResponseEntity<CategorizationRule> createRule(@RequestBody CategorizationRule rule) {
        return ResponseEntity.ok(ruleService.createRule(rule));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategorizationRule> getRule(@PathVariable Long id) {
        return ResponseEntity.ok(ruleService.getRule(id));
    }

    @GetMapping
    public ResponseEntity<List<CategorizationRule>> getAllRules() {
        return ResponseEntity.ok(ruleService.getAllRules());
    }

    @PostMapping("/test")
    public ResponseEntity<Map<String, Object>> testCategorization(@RequestBody Map<String, String> request) {
        String description = request.get("description");
        List<CategorizationRule> rules = ruleRepository.findMatchingRulesByDescription(description);
        
        // Create a mock invoice for testing
        com.example.demo.model.Invoice testInvoice = new com.example.demo.model.Invoice();
        testInvoice.setDescription(description);
        
        Category suggestedCategory = engine.determineCategory(testInvoice, rules);
        
        return ResponseEntity.ok(Map.of(
            "matchedRules", rules,
            "suggestedCategory", suggestedCategory != null ? suggestedCategory : "No category matched"
        ));
    }
}