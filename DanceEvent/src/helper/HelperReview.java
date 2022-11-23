package helper;

import entity.Review;

import java.util.ArrayList;
import java.util.List;

public class HelperReview {

    List<Review> reviews = new ArrayList<>();

    public List<Review> findAll() { return reviews; }

    public Review save(Review review) {
        reviews.add(review);
        return review;
    }

    public Review findByReviewID(long reviewID) {
        for (Review review : reviews) {
            if (review.getReviewID() == reviewID) {
                return review;
            }
        }
        return null;
    }

    public void deleteReviewByID(long reviewID) {
        List<Review> newReviews = new ArrayList<>();
        for (Review review : reviews) {
            if (review.getReviewID() != reviewID) {
                newReviews.add(review);
            }
        }
        reviews = newReviews;
    }

    int chCount = 0;
    if (int i = 0; i < )

    public static boolean hasValidLength(int length) {
        return (length <= 200);
    }
//
//    public static boolean checkComment() {
//        return true; // aanpassen!
//    }

}
