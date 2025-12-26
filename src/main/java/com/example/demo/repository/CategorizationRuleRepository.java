package com.example.demo.repository;

import com.example.demo.model.CategorizationRule;
import java.util.List;
import java.util.Optional;

public interface CategorizationRuleRepository {
    CategorizationRule save(CategorizationRule rule);
    Optional<CategorizationRule> findById(Long id);
    List<CategorizationRule> findMatchingRulesByDescription(String description);
}