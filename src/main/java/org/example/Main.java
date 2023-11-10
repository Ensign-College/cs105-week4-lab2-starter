package org.example;

public class Main {

    /* The student may wish to check their work with a main method,
     but this is not a comprehensive example, nor is it necessary
    */
    public static void main(String[] args) {

        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        account.withdraw(50.0);
        account.withdraw(100.0);
        account = new BankAccount(200.0);
    }
}