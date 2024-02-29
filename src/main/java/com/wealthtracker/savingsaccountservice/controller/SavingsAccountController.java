package com.wealthtracker.savingsaccountservice.controller;

import com.wealthtracker.savingsaccountservice.dto.SavingsAccountDTO;
import com.wealthtracker.savingsaccountservice.service.SavingsAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("savingsaccount")
public class SavingsAccountController {

    private SavingsAccountService savingsAccountService;

    public SavingsAccountController(SavingsAccountService savingsAccountService){
        this.savingsAccountService = savingsAccountService;
    }

    @GetMapping("/getbyid/{id}")
    public SavingsAccountDTO getSavingsAccountById(@PathVariable long id){
        return this.savingsAccountService.getSavingsAccountById(id);
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