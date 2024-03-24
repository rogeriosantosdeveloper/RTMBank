package controllers;

import entities.Account;

public class AccountOperation extends Account {

    double Balance = getBalance();

    public AccountOperation(int acNumber, String name, String password, double balance) {
        super(acNumber, name, password, balance);
    }
    
    public double Deposit(double deposit){
        return Balance += deposit;
    }


}
