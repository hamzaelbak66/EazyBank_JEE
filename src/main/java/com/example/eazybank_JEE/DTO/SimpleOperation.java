package com.example.eazybank_JEE.DTO;

import com.example.eazybank_JEE.DTO.Account;
import com.example.eazybank_JEE.INTERFACES.operationType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import com.example.eazybank_JEE.DTO.Operation;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleOperation extends Operation {
    private operationType type;
    private Account account;

    public SimpleOperation(LocalDate date, double price, Employee employye, operationType types, Account account) {
        super(date , price , employye);
        setType(types);
        setAccount(account);
    }
}