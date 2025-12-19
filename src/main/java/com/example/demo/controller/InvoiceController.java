package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.demo.entity.Invoice;
import com.example.demo.service.InvoiceService;

@RestController
@RequestMapping("/api/invoices");
@Tag(name = "Categories Endpoints")