import java.util.InputMismatchException;

public class Review {
    private String userName;
    private double rating;
    private String comment;

    public Review(String userName, double rating, String comment) {
        setUserName(userName);
        setRating(rating);
        setComment(comment);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRating(double rating) {
        if(rating >= 0){
                this.rating = rating;
        }else System.out.println("ratings cannot be less than 0");

    }


    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public double getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

}
