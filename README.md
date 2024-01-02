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

# Grace unto the Hearers:
In this lab, you will create a Java program that simulates a fertilizer calculator.
Additionally, you will commit your work to Git.
# What you need to know
The objective of this lab is to implement a Social Media Analyzer using Java programming techniques, 
including file reading, data processing with Java Streams, and logging.
# Lab Tasks:

SocialMediaPost Class:

Implement a SocialMediaPost class to represent individual social media posts.
Include attributes for text, likes, and shares.
Implement necessary getter methods.

Reading Data:

Implement a method (readPostsFromCSV) to read social media posts from a CSV file into a list.
Handle FileNotFoundException if the file is not found and log the error.

Data Processing:

Find the most liked post using Java Streams.
Calculate the average shares of all posts using Java Streams.
Filter posts by a keyword, considering case-insensitivity.

Logging:

Utilize logger to get relevant information, such as the most liked post and summary statistics.

# Example Run:
INFO: Most Liked Post: SocialMediaPost {text='Just hit 100K followers! Thank you all for the support. #milestone', likes=300, shares=120}
INFO: Average Shares: 54.5
INFO: Filtered Post: SocialMediaPost {text='Finished reading a great book. Any recommendations? #booklover', likes=120, shares=45}

**Tips:**
- Break down the tasks into manageable chunks for easier implementation.
- Make use of Java Streams for efficient and concise data processing.
- Check for edge cases, such as a file not found, and handle exceptions appropriately.

**Note:**
**Make sure to have the same values and use the _logger_ to test your methods if needed.**
# Grading Rubric:
- Schedule FaceTime Call functionality (18 points):
  - Makes the `readPostsFromCSV` work and handle error if the file is not found (3 points)
  - Find the most liked post `findMostLikedPost` (5 points )
  - Calculates the average shares `calculateAverageShares` (5 points)
  - Filter posts by a keyword `filterPostsByKeyword`(5 points)
- Git usage (2 points):
  - Pushed to a remote repository (2 points)
- Extra Credit: Code organization and readability (4 points):
  - Proper naming conventions (1 point)
  - Well-structured code (1 point)
  - Adequate comments/documentation (1 point)
  - Consistent indentation and formatting (1 point)