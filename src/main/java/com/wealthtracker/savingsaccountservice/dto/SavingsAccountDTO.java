package com.wealthtracker.savingsaccountservice.dto;

import com.wealthtracker.savingsaccountservice.utils.Bank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SavingsAccountDTO {

    private long id;
    private long userId;
    private String iban;
    private Bank bank;
    private boolean joint;
    private double balance;
    private double interestRate;
    private boolean fixRate;


}
