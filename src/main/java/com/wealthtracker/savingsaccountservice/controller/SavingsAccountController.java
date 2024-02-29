package com.wealthtracker.savingsaccountservice.controller;

import com.wealthtracker.savingsaccountservice.dto.SavingsAccountDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("savingsaccount")
public class SavingsAccountController {

    @GetMapping("/getbyid/{id}")
    public SavingsAccountDTO getSavingsAccountById(@PathVariable long id){
        return null;
    }

    @GetMapping("/getbyuser/{userId}")
    public List<SavingsAccountDTO> getSavingsAccountByUser(@PathVariable long userId){
        return null;
    }

    @PostMapping("/saveaccount")
    public SavingsAccountDTO saveSavingsAccount(@RequestBody SavingsAccountDTO accountDTO){
        return null;
    }

    @DeleteMapping("/deleteaccount/{id}")
    public void deleteSavingsAccount(@PathVariable long id){

    }
}