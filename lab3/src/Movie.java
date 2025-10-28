import java.util.ArrayList;

public class Movie extends Media{
    private int duration;

    public Movie(String title, String author, double price, int duration) {
        super(title, author, null, price); //since artist is the same as author
        setDuration(duration);
    }

    public void setDuration(int duration) {
        try {
            if(duration > 0){
                this.duration = duration;
            }else throw new Exception("Duration cant be 0 or less");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int getDuration() {
        return duration;
    }

    public void watch(User user){ // guessing this acts as purchase but for music
        ArrayList<Media> removed = new ArrayList<>();
        boolean hasFilm = false;
        for(Media m : user.getShoppingCart()){
            if(m instanceof Movie){
                hasFilm = true;
                user.getPurchaseMediaList().add(m);
                removed.add(m);
            }
        }

        for(Media m: removed){
            user.removeFromCart(m);
        }
        if(hasFilm) System.out.println("Film/s purchased successfully");
    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movies){
        ArrayList<Movie> playList = new ArrayList<>();
        for (Movie film: movies){
            if(film.getAuthor().equalsIgnoreCase(super.getAuthor())){
                playList.add(film);
            }
        }
        return playList;
    }
    @Override
    public String getMediaType(){
        if(this.duration >= 120){
            return "Long Movie";
        }else return "Movie";
    }
    @Override
    public String toString(){
        return String.format("Title: %s \t Director: %s \t Length: %d \t Type: %s \t Price: %.2f",
                super.getTitle(), super.getAuthor(), this.duration,this.getMediaType(),super.getPrice());
    }
}
