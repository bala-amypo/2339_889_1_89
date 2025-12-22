package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.demo.model.Invoice;
import com.example.demo.service.InvoiceService;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/invoices")
@Tag(name = "Invoice Endpoints")
public class InvoiceController{
    @Autowired
    InvoiceService invoiceService ;

    // @PostMapping("/upload/{userId}/{vendorId}")
    // public Invoice uploadInvoice(
    // @PathVariable Long userId,
    // @PathVariable Long vendorId,
    // @RequestBody Invoice invoice) {
    // return invoiceService.uploadInvoice(userId, vendorId, invoice);
    // }

    @PostMapping("/categorize/{invoiceId}")
    public Invoice  categorizeInvoice(@PathVariable Long invoiceId){
        return invoiceService.categorizeInvoice(invoiceId);
    }

    @GetMapping("/user/{userId}")
    public List<Invoice> getInvoiceByUser(@PathVariable Long userId) {
    return invoiceService.getInvoiceByUser(userId);
}

    @GetMapping("/{invoiceId}")
    public Invoice getInvoice(@PathVariable Long invoiceId){
        return invoiceService.getInvoice(invoiceId);
    }

}


