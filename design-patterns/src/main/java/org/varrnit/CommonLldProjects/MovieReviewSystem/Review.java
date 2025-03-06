package org.varrnit.CommonLldProjects.MovieReviewSystem;

public class Review {

    String reviewId;
    int score;
    String movieId;

    public Review(String reviewId, int score, String movieId) {
        this.reviewId = reviewId;
        this.score = score;
        this.movieId = movieId;
    }

    public String getReviewId() {
        return reviewId;
    }

    public int getScore() {
        return score;
    }

    public String getMovieId() {
        return movieId;
    }



    @Override
    public String toString() {
        return "Review{" +
                "reviewId='" + reviewId + '\'' +
                ", score='" + score + '\'' +
                ", movieId='" + movieId + '\'' +
                '}';
    }
}
