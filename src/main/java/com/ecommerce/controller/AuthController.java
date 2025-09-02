// src/main/java/com/ecommerce/controller/AuthController.java
package com.ecommerce.controller;

import com.ecommerce.dto.UserRegisterDto;
import com.ecommerce.dto.UserLoginDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegisterDto dto) {
        // TODO: call service
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserLoginDto dto) {
        // TODO: call service
        return ResponseEntity.ok("Login successful");
    }
}
