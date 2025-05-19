# Steward over Earthly Blessings:
In this lab, you will create a program to process a list of financial transactions using Java Collections and Streams.
Additionally, you will commit your work to Git.
# Lab Tasks:

Read Transactions from CSV:

Implement the **readTransactionsFromCSV** method to read financial transactions from a CSV file. Handle potential
FileNotFoundException by logging an error message.

Calculate Total Amount:

Implement the **calculateTotalAmount** method that utilizes Java Streams to calculate the total amount for a specific 
transaction type (Income or Expense).

Log Summary:

Implement the **calculateAndLogSummary** method to calculate and log the total income and total expenses based on the 
provided list of transactions.

Transaction Class:

Create a Transaction class with fields for date, amount, and type. Implement appropriate getters and 
a toString method for a clean representation of transaction details.

Commit your Java code and JUnit test cases to the Git repository.

# What you need to know

Core Java programming techniques you will need to know:

- How to break up a complex program into manageable chunks
- How to define a method.
- How to call a method.
- How to use Java collections
- How to use Java Streams
- How to read data from a file
- How to append single items to a list.
- How to add a list of items to a list.

# Example Run:


INFO: Transaction {date='1/1/2023', amount=500.0, type='Income'}

INFO: Transaction {date='1/2/2023', amount=-50.0, type='Expense'}

INFO: Transaction {date='1/3/2023', amount=200.0, type='Income'}

...

INFO: All transactions

INFO: Total Income: $2580.0

INFO: Total Expenses: $-400.0

**Make sure to have the same values and use the _logger_ to test your methods if needed.**

# Grading Rubric:
- Financial Transaction Processor (18 points):
  - Makes the `readTransactionsFromCSV` work and handle error if the file is not found (9 points)   
  - Gets the `calculateTotalAmount` running using java stream (9 points)
- Git usage (2 points):
  - Pushed to a remote repository (2 points)
- Extra Credit: Code organization and readability (4 points):
  - Proper naming conventions (1 point)
  - Well-structured code (1 point)
  - Adequate comments/documentation (1 point)
  - Consistent indentation and formatting (1 point)

