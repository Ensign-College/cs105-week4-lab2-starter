package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FinancialTransactionProcessorTest {
    @Test
    public void testReadTransactionsFromCSV() {
        String testFilePath = "test-transactions.csv";

        List<Transaction> transactions = FinancialTransactionProcessor.readTransactionsFromCSV(testFilePath);

        assertEquals(43, transactions.size());

        assertEquals("3/1/2023", transactions.get(0).getDate());
        assertEquals(100.0, transactions.get(0).getAmount(), 0.001);
        assertEquals("Income", transactions.get(0).getType());
        assertEquals("3/5/2023", transactions.get(1).getDate());
        assertEquals(120.0, transactions.get(1).getAmount(), 0.001);
        assertEquals("Income", transactions.get(1).getType());
        assertEquals("3/9/2023", transactions.get(2).getDate());
        assertEquals(-110.0, transactions.get(2).getAmount(), 0.001);
        assertEquals("Expense", transactions.get(2).getType());
        assertEquals("3/13/2023", transactions.get(3).getDate());
        assertEquals(95.0, transactions.get(3).getAmount(), 0.001);
        assertEquals("Income", transactions.get(3).getType());
    }

    @Test
    public void testCalculateTotalAmount(){
        String testFilePath = "test-transactions.csv";

        List<Transaction> transactions = FinancialTransactionProcessor.readTransactionsFromCSV(testFilePath);
        double totalIncome = FinancialTransactionProcessor.calculateTotalAmount(transactions, "Income");
        double totalExpenses = FinancialTransactionProcessor.calculateTotalAmount(transactions, "Expense");

        assertEquals(2090.0, totalIncome, 0.001, "Total incomes");
        assertEquals(-1110.0, totalExpenses, 0.001, "Total expenses");
    }

}
