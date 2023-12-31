package com.example.eazybank_JEE.DTO;

import com.example.eazybank_JEE.DTO.Agence;
import com.example.eazybank_JEE.DTO.Employee;
import com.example.eazybank_JEE.DTO.Client;
import com.example.eazybank_JEE.INTERFACES.statut;
import lombok.Getter;
import lombok.Setter;
import com.example.eazybank_JEE.DTO.Operation;
import java.time.LocalDate;
import java.util.List;

public class Account {
    protected String AccNum;
    protected double Balance;
    protected LocalDate creationDate;
    protected statut Statut;
    protected List<Operation> operation;
    protected Client Client;
    protected Employee Employye;
    @Setter
    @Getter
    protected Agence agence;

    public Account(String accnum, double balance, LocalDate creationdate, statut status, Client client, Employee employye, Agence agence) {
        this.AccNum = accnum;
        this.Balance = balance;
        this.creationDate = creationdate;
        this.Statut = status;
        setClient(client);
        setEmployye(employye);
        setAgence(agence);
    }
    public Account(String accnum, double balance, LocalDate creationdate, statut status, Client client, Employee employye) {
        this.AccNum = accnum;
        this.Balance = balance;
        this.creationDate = creationdate;
        this.Statut = status;
        setClient(client);
        setEmployye(employye);
    }

    public Employee getEmployye() {
        return Employye;
    }

    public void setEmployye(Employee employye) {
        Employye = employye;
    }

    public List<Operation> getOperation() {
        return operation;
    }

    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client client) {
        Client = client;
    }


    public String getAccNum() {
        return AccNum;
    }

    public void setAccNum(String accNum) {
        AccNum = accNum;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public statut getStatut() {
        return Statut;
    }

    public void setStatut(statut statut) {
        Statut = statut;
    }
}
