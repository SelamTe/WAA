package edu.miu.lab6.service;

import edu.miu.lab6.entity.dto.request.LoginRequest;
import edu.miu.lab6.entity.dto.response.LoginResponse;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);

    ResponseEntity<?> refreshToken(String requestRefreshToken);
}
