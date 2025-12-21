package com.example.demo.service;

import com.example.demo.model.CategorizationRule;
import java.util.List;

public interface CategorizationRuleService {

    CategorizationRule saveRule(CategorizationRule rule);

    List<CategorizationRule> getAllRules();

    void deleteRule(Long id);
}
