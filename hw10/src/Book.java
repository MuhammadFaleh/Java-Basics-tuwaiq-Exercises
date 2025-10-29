public class Book extends Product{
    private String author;

    Book(){

    }

    Book(String name, double price, String author){
        super(name,price);
        setAuthor(author);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public double getDiscount() {
        return super.getPrice() - super.getPrice() * .15;
    }
}
