package org.varrnit.CommonLldProjects.MovieReviewSystem;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ReviewService platform = new ReviewService();

        User user1 = new User("u1", "Alice");
        User user2 = new User("u2", "Bob");

        platform.addUser(user1);
        platform.addUser(user2);

        Movie movie1 = new Movie("m1", "Inception", LocalDate.of(2010, 7, 16));
        Movie movie2 = new Movie("m2", "Titanic", LocalDate.of(1997, 12, 19));

        platform.addMovie(movie1);
        platform.addMovie(movie2);

        platform.addReview("u1", "m1", 8);
        platform.addReview("u2", "m1", 9);
        platform.addReview("u1", "m2", 10);
        platform.addReview("u2", "m2", 7);

        System.out.println("Reviews by user1: " + platform.listReviewsByUser("u1"));

//        System.out.println("Top 2 movies: " + platform.listTopMoviesByScore(2, Optional.empty(), Optional.empty()));
    }
}
