package com.example.demo.service;
import java.util.List;
import com.example.demo.model.CategorizationRule;

public interface CategorizationRuleService{
    CategorizationRule createRule(Long categoryId,CategorizationRule rule);
    List<CategorizationRule> getRulesByCategory(Long categoryId);
    void deleteRule(Long ruleId);
}
package com.example.demo.service;

import com.example.demo.model.Invoice;
import com.example.demo.model.Category;
import com.example.demo.model.CategorizationRule;
import java.util.List;

public interface CategorizationService {
    Category categorizeInvoice(Invoice invoice);
    List<CategorizationRule> findMatchingRules(String description);
    Category testCategorization(String description);
}