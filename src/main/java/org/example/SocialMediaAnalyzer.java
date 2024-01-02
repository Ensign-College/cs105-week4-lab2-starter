package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;

class SocialMediaPost {

    private String text;
    private int likes;
    private int shares;

    public SocialMediaPost(String text, int likes, int shares) {
        this.text = text;
        this.likes = likes;
        this.shares = shares;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public int getShares() {
        return shares;
    }

    @Override
    public String toString() {
        return "SocialMediaPost {" +
                "text='" + getText() + '\'' +
                ", likes=" + getLikes() +
                ", shares=" + getShares() +
                '}';
    }
}

public class SocialMediaAnalyzer {
    private static final Logger logger = Logger.getLogger(SocialMediaAnalyzer.class.getName());
    public static List<SocialMediaPost> readPostsFromCSV(String filePath) {
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();
        Scanner myReader = null;
        File socialMediaPostsFile = new File(filePath);

        Path pathFile = Paths.get(filePath);
        if (Files.notExists(pathFile)){
            logger.severe(filePath+"File not found");
        }


        try {
            myReader = new Scanner(socialMediaPostsFile);
            if (myReader.hasNextLine()){
                myReader.nextLine();
            }else {
                logger.severe(filePath + " does not contain headers");
            }

            while (myReader.hasNextLine()) {
                String[] data = (myReader.nextLine()).split(",");
                String text = data[0].trim();
                int likes = Integer.parseInt(data[1].trim());
                int shares = Integer.parseInt(data[2].trim());

                socialMediaPosts.add(new SocialMediaPost(text,likes,shares));
            }
        } catch (FileNotFoundException e) {
            logger.severe(filePath + " not found");
        }

        return socialMediaPosts;
    }

    public static SocialMediaPost findMostLikedPost(List<SocialMediaPost> posts) {
        SocialMediaPost mostLikedPost = posts.stream()
                .max(java.util.Comparator.comparingInt(SocialMediaPost::getLikes))
                .orElse(null);
        return mostLikedPost;
    }

    public static double calculateAverageShares(List<SocialMediaPost> posts) {
        double averageShares = posts.stream()
                .mapToDouble(SocialMediaPost::getShares)
                .average()
                .orElse(0.0);
        return averageShares;
    }

    public static List<SocialMediaPost> filterPostsByKeyword(List<SocialMediaPost> posts, String keyword) {
        List<SocialMediaPost> filteredPosts = posts.stream()
                .filter(post -> post.getText().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
        return filteredPosts;
    }
}
