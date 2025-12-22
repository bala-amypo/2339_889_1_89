package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.exception.ResourceNotFoundException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    // @Override
    // public User registerUser(User user) {
    //     if (repo.existsByEmail(user.getEmail())) {
    //         throw new RuntimeException("Email already in use");
    //     }
    //     user.setRole("USER");
    //     return repo.save(user);
    // }

    @Override
    public User findByEmail(String email) {
        User user = repo.findByEmail(email);
        if (user == null) {
            throw new ResourceNotFoundException("User not found");
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
