package com.example.demo.service.impl;
import java.util.List;
import org.springfraework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Vendor;
import com.example.demo.entity.repository.VendorRepository;
import com.example.demo.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService{
    @Autowired
    private UserRepository userRepository;

    @override
    public User registerUser(User user){
        return userRepository.save(user);
    }

    @override
    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }
    @override
    public List<User> getAllUsers(){
        return userRepository.findall();
    }
}