package com.example.demo.service;
import java.util.*;
import com.example.demo.model.User;

public interface UserService{
    User registerUser(User user);
    Optional<User> findByEmail(String email);
    List<User> getAllUsers();
}

