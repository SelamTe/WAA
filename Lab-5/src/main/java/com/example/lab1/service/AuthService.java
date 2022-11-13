package com.example.lab1.service;

import com.example.lab1.domain.dto.request.LoginRequest;
import com.example.lab1.domain.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login (LoginRequest longinRequest);
}
