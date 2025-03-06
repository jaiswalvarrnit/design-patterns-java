package org.varrnit.CommonLldProjects.MovieReviewSystem;

import java.util.*;
import java.util.stream.Collectors;

public class ReviewService {

    Map<String,User> userHashMap;
    Map<String,Movie> movieHashMap;
    Map<String, List<Review>> movieReviews;
    Map<String, List<Review>> userReviews;


    public ReviewService() {
        userHashMap = new HashMap<>();
        movieHashMap = new HashMap<>();
        movieReviews = new HashMap<>();
        userReviews = new HashMap<>();
    }

    void addUser(User user){
        userHashMap.put(user.getUserId(),user);
    }

    void addMovie(Movie movie){
        movieHashMap.put(movie.getMovieId(),movie);
    }

    void addReview(String userId, String movieId, int score) {
        if (!movieHashMap.containsKey(movieId) || !movieHashMap.get(movieId).isMovieReleased() || userReviews.getOrDefault(userId, new ArrayList<>()).stream().anyMatch(review -> review.getMovieId().equals(movieId))) {
            throw new IllegalArgumentException("Invalid review");
        }

        User user = userHashMap.get(userId);
        Movie movie = movieHashMap.get(movieId);
        Review review = new Review(userId, score, movieId);

        user.incrementReviewCount();
        int weightedScore = user.getUserCategory() == UserCategorization.CRITIC ? score * 2 : score;
        movie.addReviewScore(weightedScore);

        movieReviews.computeIfAbsent(movieId, k -> new ArrayList<>()).add(review);
        userReviews.computeIfAbsent(userId, k -> new ArrayList<>()).add(review);
    }

    public void deleteReview(String userId, String movieId) {
        List<Review> reviews = userReviews.get(userId);
        for (Review review : reviews) {
            if (review.getMovieId().equals(movieId)) {
                Movie movie = movieHashMap.get(movieId);
                int weightedScore = review.getScore();
                if (userHashMap.get(userId).getUserCategory() == UserCategorization.CRITIC) {
                    weightedScore *= 2;
                }
                movie.addReviewScore(-weightedScore);
                reviews.remove(review);
                movieReviews.get(movieId).remove(review);
                break;
            }
        }
    }

    public List<Review> listReviewsByUser(String userId) {
        return userReviews.getOrDefault(userId, new ArrayList<>());
    }

    // updateReview()

    // listTopMoviesByScore

}
