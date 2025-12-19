package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.CategorizationRule;

public interface CategorizationRuleService{
    CategorizationRule createRule(Long categoryId,CategorizationRule rule);
    List<CategorizationRule> getRulesByCategory(Long categoryId);
    void deleteRule(long ruleId);
}