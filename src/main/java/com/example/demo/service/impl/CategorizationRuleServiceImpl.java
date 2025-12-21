package com.example.demo.service.impl;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.CategorizationRuleService;
import com.example.demo.exception.ResourceNotFoundException;

import java.util.List;

public class CategorizationRuleServiceImpl implements CategorizationRuleService {

    private final CategorizationRuleRepository ruleRepo;
    private final CategoryRepository categoryRepo;

    public CategorizationRuleServiceImpl(
            CategorizationRuleRepository ruleRepo,
            CategoryRepository categoryRepo
    ) {
        this.ruleRepo = ruleRepo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public CategorizationRule createRule(Long categoryId, CategorizationRule rule) {

        Category category = categoryRepo.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found"));

        rule.setCategory(category);
        return ruleRepo.save(rule);
    }

    @Override
    public List<CategorizationRule> getRulesByCategory(Long categoryId) {

        Category category = categoryRepo.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found"));

        return ruleRepo.findAll()
                .stream()
                .filter(r -> r.getCategory().getId().equals(category.getId()))
                .toList();
    }

    @Override
    public void deleteRule(Long ruleId) {

        CategorizationRule rule = ruleRepo.findById(ruleId)
                .orElseThrow(() -> new ResourceNotFoundException("Rule not found"));

        ruleRepo.delete(rule);
    }
}
