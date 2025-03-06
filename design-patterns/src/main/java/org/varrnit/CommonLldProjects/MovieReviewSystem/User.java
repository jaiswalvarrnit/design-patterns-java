package org.varrnit.CommonLldProjects.MovieReviewSystem;

public class User {

    String userId;
    String username;
    int reviewCount;

    public UserCategorization getUserCategory() {
        return userCategory;
    }

    UserCategorization userCategory;


    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
        this.reviewCount = 0;
        this.userCategory = UserCategorization.NORMAL_USER;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    void incrementReviewCount(){
        reviewCount += 1;
        if(reviewCount>= 3){
            this.userCategory=UserCategorization.CRITIC;
        }
    }




    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", reviewCount=" + reviewCount +
                ", userCategory='" + userCategory + '\'' +
                '}';
    }
}
