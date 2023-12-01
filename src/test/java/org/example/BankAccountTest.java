package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.01);
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(100.0);
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), 0.01);
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(50.0);
        account.withdraw(100.0);
        assertNotEquals(-50.0, account.getBalance(), 0.01);
    }

    @Test
    void testCheckBalance() {
        BankAccount account = new BankAccount(200.0);
        assertEquals(200.0, account.getBalance(), 0.01);
    }
}
