package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SocialMediaAnalyzerTest {
    @Test
    public void testReadPostsFromCSV() {
        String testFilePath = "test-socialMediaData.csv";
        List<SocialMediaPost> posts = SocialMediaAnalyzer.readPostsFromCSV(testFilePath);
        assertNotNull(posts);
        assertEquals(posts.size(),50);
        assertEquals("Excited to announce our new project! #innovation", posts.get(0).getText());
        assertEquals(120, posts.get(0).getLikes(), 0.001);
        assertEquals(50, posts.get(0).getShares());
        assertEquals("Enjoying a lazy Sunday at home. #sundayvibes", posts.get(44).getText());
        assertEquals(1000, posts.get(44).getLikes(), 0.001);
        assertEquals(200, posts.get(44).getShares());
    }

    @Test
    public void testFindMostLikedPost() {
        String testFilePath = "test-socialMediaData.csv";
        List<SocialMediaPost> posts = SocialMediaAnalyzer.readPostsFromCSV(testFilePath);
        SocialMediaPost mostLikedPost = SocialMediaAnalyzer.findMostLikedPost(posts);
        assertNotNull(mostLikedPost);
        assertEquals("Enjoying a lazy Sunday at home. #sundayvibes", mostLikedPost.getText());
    }

    @Test
    public void testCalculateAverageShares() {
        String testFilePath = "test-socialMediaData.csv";
        List<SocialMediaPost> posts = SocialMediaAnalyzer.readPostsFromCSV(testFilePath);
        double averageShares = SocialMediaAnalyzer.calculateAverageShares(posts);
        assertEquals(48.9, averageShares, 0.001);
    }

    @Test
    public void testFilterPostsByKeyword() {
        String testFilePath = "test-socialMediaData.csv";
        List<SocialMediaPost> posts = SocialMediaAnalyzer.readPostsFromCSV(testFilePath);
        List<SocialMediaPost> filteredPosts = SocialMediaAnalyzer.filterPostsByKeyword(posts, "sunday");
        assertNotNull(filteredPosts);
        assertEquals(2, filteredPosts.size());
    }
}