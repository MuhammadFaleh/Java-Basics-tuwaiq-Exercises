public class Movie extends Product{
    private String director;

    public Movie() {

    }

    public Movie(String name, double price, String director) {
        super(name, price);
        setDirector(director);
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public double getDiscount() {
        return super.getPrice() - super.getPrice() * .25;
    }
}
