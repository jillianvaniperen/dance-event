package entity;
import java.io.Serializable;

public class Review implements Serializable {
    private long reviewID;
    private String displayName;
    private String email;
    private int rating;
    private String comment;

    public Review() {}

    public Review(long reviewID, String displayName, String email, int rating, String comment) {
        this.reviewID = reviewID;
        this.rating = rating;
        this.comment = comment;
    }

    public long getReviewID() { return reviewID; }

    public void setReviewID(long reviewID) { this.reviewID = reviewID; }

    public int getRating() { return rating; }

    public void setRating(int rating) { this.rating = rating; }

    public String getComment() { return comment; }

    public void setComment(String comment) { this.comment = comment; }
}
