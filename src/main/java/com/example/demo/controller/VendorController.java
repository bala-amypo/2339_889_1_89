package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.demo.entity.Vendor;
import com.example.demo.service.VendorService;

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

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email){
        return userService.findByEmail(email);
    }
}
