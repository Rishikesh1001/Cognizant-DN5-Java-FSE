package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class LoanController {

    @GetMapping("/loans")
    public List<Map<String, Object>> getLoans() {

        return List.of(
                Map.of(
                        "loanId", "L101",
                        "customer", "Rishikesh",
                        "amount", 250000
                ),
                Map.of(
                        "loanId", "L102",
                        "customer", "Rahul",
                        "amount", 500000
                )
        );
    }
}