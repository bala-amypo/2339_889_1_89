package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.demo.model.Vendor;
import com.example.demo.service.VendorService;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/vendors")
@Tag(name = "Vendors Endpoints")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @PostMapping
    public Vendor createVendor(@RequestBody Vendor vendor){
        return vendorService.createVendor(vendor);
    }
    @GetMapping
    public List<Vendor> getAllVendors(){
        return vendorService.getAllVendors();
    }

    @GetMapping("/{vendorId}")
    public Vendor getVendor(@PathVariable Long vendorId){
        return vendorService.getVendor(vendorId);
    }
}
