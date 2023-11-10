package org.example;


import java.util.logging.Logger;

public class BankAccount {

    private static final Logger logger = Logger.getLogger(BankAccount.class.getName());
    private double balance;

    public BankAccount(double initialBalance) {
     // TODO: add the code to make the balance equal to the initialBalance
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
    // TODO: add the code to update the balance by adding the amount passed in the function call
    }

    public void withdraw(double amount) {
    // TODO: add the code to update the balance by subtracting the amount passed in the function call
    }



}

