package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.CategorizationRule;
import java.util.List;

public interface CategorizationRuleRepository extends JpaRepository<CategorizationRule, Long> {
    List<CategorizationRule> findMatchingRulesByDescription(String description);
}
