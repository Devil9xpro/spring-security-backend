package com.example.springsecuritybackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/myLoans")
    public String getLoanDetails(String input) {
        return "Here are the loans details from the DB";
    }
}
