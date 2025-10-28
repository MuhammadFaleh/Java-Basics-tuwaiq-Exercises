import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> review;
    public Book(String title, String author, String iSBN,
         double price,ArrayList<Review> review, int stock ){
        super(title, author, iSBN, price);
        setReview(review);
        setStock(stock);

    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReview() {
        return this.review;
    }

    public int getStock() {
        return this.stock;
    }

    public void addReview(Review r){
        review.add(r);
    }

    public double getAverageRating(){
        if(this.review == null) {
            return 0.0;
        }
        double counter = 0;
        double ratings = 0;
        for (Review r: this.review) {
            ratings += r.getRating();
            counter++;
        }
        return ratings / counter;
    }
    public void purchase(User user){
        ArrayList<Media> removed = new ArrayList<>();
        boolean hasBook = false;
        for(Media m : user.getShoppingCart()){
            if(m instanceof Book){
                if(((Book) m).stock > 0){
                        hasBook = true;
                        user.getPurchaseMediaList().add(m);
                        removed.add(m);
                        ((Book) m).stock--;
                }else{
                    System.out.printf("%s is out of stuck\n", m.getTitle());
                }
            }
        }

        for(Media m: removed){
            user.removeFromCart(m);
        }
        if(hasBook) System.out.println("book/s purchased successfully");

    }

    public boolean isBestSeller(){
        if(getAverageRating() >= 4.5){
            return true;
        }
        else return false;
    }

    public void restock(int quantity){
        if(quantity > 0){
            this.stock += quantity;
        }else System.out.println("quantity cant be 0 or less");

    }

    @Override
    public String getMediaType(){
        if(isBestSeller()){
            return "Bestselling Book";
        }else return "Book";
    }
    @Override
    public String toString(){
        return String.format("Title: %s \t Author: %s \t Rating: %.1f \t Type: %s \t Stock: %d \t Price: %.1f",
                super.getTitle(), super.getAuthor(),getAverageRating(),this.getMediaType()
                ,this.stock, super.getPrice());
    }
}
