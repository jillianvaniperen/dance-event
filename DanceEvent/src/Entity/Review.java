package Entity;
import java.io.Serializable;

public class Review implements Serializable {
    private String displayName;
    private String email;
    private int rating;
    private String comment;

    public Review() {}

    public String getDisplayName() { return this.displayName; }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() { return this.email; }

    public void setEmail(String email) {
        this.email = email;
    }

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
