
package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.demo.model.CategorizationRule;
import com.example.demo.service.CategorizationRuleService;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/rules")
@Tag(name = "Categorization Rule Endpoints")
public class CategorizationRuleController{
    @Autowired
    CategorizationRuleService ruleService ;

    @PostMapping("/category/{categoryId}")
    public CategorizationRule createRule(
        @PathVariable Long categoryId,
        @RequestBody CategorizationRule rule){
       return ruleService.createRule(categoryId,rule);
    }

    @GetMapping("/category/{categoryId}")
    public List<CategorizationRule> getRulesByCategory(
        @PathVariable Long categoryId){
        return ruleService.getRulesByCategory(categoryId);
    }

    @DeleteMapping("/{ruleId}")
    public void deleteRule(@PathVariable Long ruleId){
       ruleService.deleteRule(ruleId);
    }
}

