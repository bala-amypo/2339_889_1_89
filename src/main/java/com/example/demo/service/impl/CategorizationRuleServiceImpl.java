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
    private CategorizationRuleRepository rep;
    public 
    @Override CategorizationRuleServiceImpl (CategorizationRuleRepository rep){
        this.rep=rep;
    }
    public CategorizationRule createRule(Long categoryId,CategorizationRule rule) {
        rule.setCategory(categoryRepository.findById(categoryId).orElse(null));
        return rep.save(rule);
    }

    @Override
    public List<CategorizationRule> getRulesByCategory(Long categoryId){
        return rep.findByCategoryId(categoryId);
    }

    @Override
    public void deleteRule(Long ruleId){
        ruleRepository.deleteById(ruleId);
    }
}
