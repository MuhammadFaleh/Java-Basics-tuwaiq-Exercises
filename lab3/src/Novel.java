import java.util.ArrayList;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, String iSBN, double price, ArrayList<Review> review, int stock, String genre) {
        super(title, author, iSBN, price, review, stock);
        setGenre(genre);
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String getMediaType(){
        if(super.isBestSeller()){
            return "Bestselling Novel";
        }else return "Novel";
    }
    @Override
    public String toString(){
        return String.format("Title: %s \t Author: %s \t Rating: %.1f \t Genre: %s \t Type: %s \t Price: %.1f",
                super.getTitle(), super.getAuthor(),getAverageRating(),this.genre, this.getMediaType()
                ,super.getPrice());
    }
}
