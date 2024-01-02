package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


class Transaction {
    private String date;
    private double amount;
    private String type;

    public Transaction(String date, double amount, String type) {
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transaction {" +
                "date='" + getDate() + '\'' +
                ", amount=" + getAmount() +
                ", type='" + getType() + '\'' +
                '}';
    }
}


public class FinancialTransactionProcessor {

    private static final Logger logger = Logger.getLogger(FinancialTransactionProcessor.class.getName());

    public static void calculateAndLogSummary(List<Transaction> transactions) {
        double totalIncome = calculateTotalAmount(transactions, "Income");
        double totalExpenses = calculateTotalAmount(transactions, "Expense");

        // Log summary
        logger.info("\nSummary:");
        logger.info("Total Income: $" + totalIncome);
        logger.info("Total Expenses: $" + totalExpenses);
    }

    public static double calculateTotalAmount(List<Transaction> transactions, String transactionType) {
        return transactions.stream()
                .filter(transaction -> transaction.getType().equals(transactionType))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public static List<Transaction> readTransactionsFromCSV(String filePath) {
        List<Transaction> transactions = new ArrayList<>();
        Scanner myReader = null;
        File transactionFile = new File(filePath);
        try {
            myReader = new Scanner(transactionFile);
            myReader.nextLine();

            while (myReader.hasNextLine()) {
                String[] data = (myReader.nextLine()).split(",");
                String date = data[0].trim();
                double amount = Double.parseDouble(data[1].trim());
                String type = data[2].trim();

                transactions.add(new Transaction(date, amount, type));
            }
        } catch (FileNotFoundException e) {
            logger.severe(filePath+"File not found");
        }

        return transactions;
    }
}


