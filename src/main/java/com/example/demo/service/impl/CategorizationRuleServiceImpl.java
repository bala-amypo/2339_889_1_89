package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CategorizationRule;
import com.example.demo.repository.CategorizationRuleRepository;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategorizationRuleService;

@Service
public class CategorizationRuleServiceImpl implements CategorizationRuleService {
    
    @Autowired
    private CategorizationRuleRepository ruleRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public CategorizationRule createRule(Long categoryId,CategorizationRule rule) {
        rule.setCategory(categoryRepository.findById(categoryId).orElse(null));
        return ruleRepository.save(rule);
    }

    @Override
    public List<CategorizationRule> getRulesByCategory(Long categoryId){
        return ruleRepository.findByCategoryId(categoryId);
    }

    @Override
    public void deleteRule(Long ruleId){
        ruleRepository.deleteById(ruleId);
    }
}
