package com.example.demo.util;

import com.example.demo.model.*;
import java.util.List;

public class InvoiceCategorizationEngine {

    public Category determineCategory(
            Invoice invoice,
            List<CategorizationRule> rules) {

        rules.sort((a, b) -> b.getPriority().compareTo(a.getPriority()));

        for (CategorizationRule rule : rules) {

            String desc = invoice.getDescription().toLowerCase();
            String key = rule.getKeyword().toLowerCase();

            switch (rule.getMatchType()) {
                case "EXACT":
                    if (desc.equals(key)) return rule.getCategory();
                    break;
                case "CONTAINS":
                    if (desc.contains(key)) return rule.getCategory();
                    break;
                case "REGEX":
                    if (desc.matches(key)) return rule.getCategory();
                    break;
            }
        }
        return null;
    }
}
