package org.example;

import java.util.List;
import java.util.logging.Logger;

public class Main {

    /* The student may wish to check their work with a main method,
     but this is not a comprehensive example, nor is it necessary
    */

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Financial Transaction

        String transactionsFile = "transactions.csv";
        List<Transaction> transactions;
        transactions = FinancialTransactionProcessor.readTransactionsFromCSV(transactionsFile);
        transactions.forEach(transaction -> logger.info(transaction.toString()));
        logger.info("All transactions");
        FinancialTransactionProcessor.calculateAndLogSummary(transactions);

        //Social Media Analyzer
        String postsFile = "socialMediaData.csv";
        List<SocialMediaPost> posts;
        posts = SocialMediaAnalyzer.readPostsFromCSV(postsFile);
        logger.info("Social Media Analyzer Reading...");
        SocialMediaPost mostLikedPost = SocialMediaAnalyzer.findMostLikedPost(posts);
        logger.info("Most Liked Post: " + mostLikedPost);
        double averageShares = SocialMediaAnalyzer.calculateAverageShares(posts);
        logger.info("Average Shares: " + averageShares);
        List<SocialMediaPost> filteredPosts = SocialMediaAnalyzer.filterPostsByKeyword(posts, "book");
        filteredPosts.forEach(post -> logger.info("Filtered Post: " + post));
    }
}