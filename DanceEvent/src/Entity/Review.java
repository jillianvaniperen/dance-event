package Entity;
import java.io.Serializable;

public class Review implements Serializable {
    private int rating;
    private String comment;

    public Review() {}

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
