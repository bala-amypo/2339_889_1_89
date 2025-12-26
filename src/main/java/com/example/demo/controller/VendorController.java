package com.example.demo.controller;

import com.example.demo.model.Vendor;
import com.example.demo.service.impl.VendorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {

    @Autowired
    private VendorServiceImpl vendorService;

    @PostMapping
    public ResponseEntity<Vendor> createVendor(@RequestBody Vendor vendor) {
        Vendor savedVendor = vendorService.createVendor(vendor);
        return ResponseEntity.ok(savedVendor);
    }
}