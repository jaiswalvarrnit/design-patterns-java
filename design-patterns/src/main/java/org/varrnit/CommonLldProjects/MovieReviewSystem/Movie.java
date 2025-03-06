package org.varrnit.CommonLldProjects.MovieReviewSystem;

import java.time.LocalDate;

public class Movie {

    String movieId;
    String movieName;
    LocalDate releaseDate;
    int totalReviewScore;


    public Movie(String movieId, String movieName, LocalDate releaseDate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.totalReviewScore = 0;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    boolean isMovieReleased(){
        return !releaseDate.isAfter(LocalDate.now());
    }

    void addReviewScore(int score){
        totalReviewScore += score;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "movieId='" + movieId + '\'' +
                ", movieName='" + movieName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
