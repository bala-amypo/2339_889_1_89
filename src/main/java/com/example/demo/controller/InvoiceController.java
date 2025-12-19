package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.demo.entity.Invoice;
import com.example.demo.service.InvoiceService;

@RestController
@RequestMapping("/api/invoices")
@Tag(name = "Invoice Endpoints")
public class InvoiceController{
    @Autowired
    private InvoiceService invoiceService ;

    @PostMapping("/upload/{userId}/{vendorId}")
    public Invoice uploadInvoice(
        @pathVariable Long userId,
        @pathVariable Long vendorId,
        @RequestBody Invoice invoice){

        return invoiceService.uploadInvoice(userId,vendorId,invoice);
        }
    @PostMapping("/categorize/{invoiceId}")
    public Invoice  categorizeInvoice(@PathVariable Long invoiceId){
        return invoiceService.categorizeInvoice(invoiceId);
    }

    @GetMapping("/user/{userId}")
    public List<Invoice> getInvoicesByUser(@PathVariable Long userId){
        return invoiceService.getInvoiceByUser(invoiceId);
    }
    }

}