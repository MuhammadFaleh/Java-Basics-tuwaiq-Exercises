import java.util.ArrayList;

public class AcademicBook extends  Book{
    private String subject;

    public AcademicBook(String title, String author, String iSBN, double price,
                        ArrayList<Review> review, int stock, String subject) {
        super(title, author, iSBN, price, review, stock);
        setSubject(subject);
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    @Override
    public String getMediaType(){
        if(super.isBestSeller()){
            return "Bestselling AcademicBook";
        }else return "AcademicBook";
    }
    @Override
    public String toString(){
        return String.format("Title: %s \t Author: %s \t Rating: %.1f \t Subject: %s \t Price: %.1f",
                super.getTitle(), super.getAuthor(),getAverageRating(),this.subject,super.getPrice());
    }
}
