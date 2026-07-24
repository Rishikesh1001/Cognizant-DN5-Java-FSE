package com.cognizant.controller;

import com.cognizant.util.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/token")
    public String generateToken(@RequestParam String username) {
        return JwtUtil.generateToken(username);
    }
}