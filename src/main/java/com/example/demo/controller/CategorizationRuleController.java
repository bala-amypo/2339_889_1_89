package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.demo.entity.CategorizationRule;
import com.example.demo.service.CategorizationRuleService;

@RestController
@RequestMapping("/api/rules")
@Tag(name = "Categorization Rule Endpoints")
public class CategorizationRuleController{
    @Autowired
    private CategorizationRuleService ruleService ;

    @PostMapping("/category/{categoryId}")
    public CategorizationRule createRule(
        @PathVariable Long categoryId,
        @RequestBody CategorizationRule rule){
            return ruleService.createRule(categoryId,rule);
        }

        @GetMapping("/category/{categoryId}")
        public List<CategorizationRule> getRulesByCategory()
    )

}