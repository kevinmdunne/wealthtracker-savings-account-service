package com.wealthtracker.savingsaccountservice.service;

import com.wealthtracker.savingsaccountservice.dto.SavingsAccountDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class SavingsAccountService {

    public SavingsAccountDTO getSavingsAccountById(long id){
        return SavingsAccountDTO.builder().id(id).build();
    }

    public List<SavingsAccountDTO> getSavingsAccountByUser(long userId){
        List<SavingsAccountDTO> result = new ArrayList<>();
        return result;
    }

    public SavingsAccountDTO saveSavingsAccount(SavingsAccountDTO accountDTO){
        return accountDTO;
    }

    public void deleteSavingsAccount(long id){

    }
}
