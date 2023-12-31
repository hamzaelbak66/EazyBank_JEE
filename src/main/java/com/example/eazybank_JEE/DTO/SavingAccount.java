package com.example.eazybank_JEE.DTO;

import com.example.eazybank_JEE.INTERFACES.statut;

import java.time.LocalDate;

public final class SavingAccount extends Account {
    private double InterestRate;

    public SavingAccount(String accnum, double balance, LocalDate creationdate, statut status, double interestrate, Client client, Employee employye, Agence agence) {
        super(accnum, balance, creationdate, status, client, employye, agence);
        this.InterestRate = interestrate;
    }

    public SavingAccount(String accnum, double balance, LocalDate creationdate, statut status, double interestrate, Client client, Employee employye) {
        super(accnum, balance, creationdate, status, client, employye);
        this.InterestRate = interestrate;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }

}
