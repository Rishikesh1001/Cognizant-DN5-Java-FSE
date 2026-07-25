package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/accounts")
    public List<Map<String, Object>> getAccounts() {

        return List.of(
                Map.of(
                        "accountNumber", "1001",
                        "accountHolder", "Rishikesh",
                        "balance", 50000
                ),
                Map.of(
                        "accountNumber", "1002",
                        "accountHolder", "Rahul",
                        "balance", 75000
                )
        );
    }
}