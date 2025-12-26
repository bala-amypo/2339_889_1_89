package com.example.demo.security;

import com.example.demo.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtUtilImpl implements JwtUtil {
    
    @Override
    public String generateToken(UserDetails userDetails, User user) {
        return "mock-jwt-token-" + user.getId() + "-" + user.getEmail() + "-" + user.getRole();
    }
    
    @Override
    public boolean validateToken(String token, UserDetails userDetails) {
        return token != null && !token.isEmpty() && userDetails != null;
    }
}