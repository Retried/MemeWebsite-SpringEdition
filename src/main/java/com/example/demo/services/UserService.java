package com.example.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
    void save(UserRegistrationDto registrationDto);
}