package com.wealthtracker.savingsaccountservice.service;

import com.wealthtracker.savingsaccountservice.dto.SavingsAccountDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SavingsAccountService {

    Logger logger = LoggerFactory.getLogger(SavingsAccountService.class);

    public SavingsAccountDTO getSavingsAccountById(long id){
        logger.info("getSavingsAccountById");
        return SavingsAccountDTO.builder().id(id).build();
    }

    public List<SavingsAccountDTO> getSavingsAccountByUser(long userId){
        logger.info("getSavingsAccountByUser");
        List<SavingsAccountDTO> result = new ArrayList<>();
        return result;
    }

    public SavingsAccountDTO saveSavingsAccount(SavingsAccountDTO accountDTO){
        logger.info("saveSavingsAccount");
        return accountDTO;
    }

    public void deleteSavingsAccount(long id){
        logger.info("deleteSavingsAccount");
    }
}
