

import com.example.demo.model.Invoice;
import com.example.demo.model.Category;
import com.example.demo.model.CategorizationRule;
import java.util.List;

public interface CategorizationRuleService {
    Category categorizeInvoice(Invoice invoice);
    List<CategorizationRule> findMatchingRules(String description);
    Category testCategorization(String description);
}