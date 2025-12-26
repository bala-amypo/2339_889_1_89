package com.example.demo.security;

import com.example.demo.model.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface JwtUtil {
    String generateToken(UserDetails userDetails, User user);
    boolean validateToken(String token, UserDetails userDetails);
}