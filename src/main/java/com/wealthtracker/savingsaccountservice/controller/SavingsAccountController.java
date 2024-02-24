package com.wealthtracker.savingsaccountservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("savingsaccount")
public class SavingsAccountController {

    @GetMapping("/dummy")
    public String dummy(){
        return "I am playing around with Docker for real this time....";
    }
}