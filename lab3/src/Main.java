import java.util.ArrayList;
import java.util.Random;
public class Main {
    static void printLists(ArrayList objects){
        for (Object o : objects) {
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        // reviews
        ArrayList<Review> bookReviews = new ArrayList<>();
        ArrayList<Review> novelReviews = new ArrayList<>();
        ArrayList<Review> academicReviews = new ArrayList<>();

        bookReviews.add(new Review("user1", 5.0, "comment"));
        bookReviews.add(new Review("user2", 4.0, "comment"));

        novelReviews.add(new Review("user3", 4.5, "comment"));

        academicReviews.add(new Review("user4", 3.5, "comment"));

        // books
        Book book1 = new Book("book1", "author1", "ISBN1", 49.5, bookReviews, 5);
        Novel novel1 = new Novel("book2", "author2", "ISBN2", 29.1,
                novelReviews, 3, "genre1");
        AcademicBook academicBook1 = new AcademicBook("book3", "author3",
                "ISBN3", 50.0, academicReviews, 2, "subject1");

        // music
        Music music1 = new Music("song1", "artist1", 10.4);
        Music music2 = new Music("song2", "artist2", 2.2);
        Music music3 = new Music("song3", "artist3", 0.5);
        Music music4 = new Music("song4", "artist1", 1);

        // movies
        Movie movie1 = new Movie("movie1", "director1", 19,120);
        Movie movie2 = new Movie("movie2", "director2", 14.5,90);

        // users
        User user1 = new User("user1", "user1@email.com", new ArrayList<>(), new ArrayList<>());
        User user2 = new User("user2", "user2@email.com", new ArrayList<>(), new ArrayList<>());

        // test shopping list
        user1.addToCart(book1);
        user1.addToCart(music1);
        user1.addToCart(movie1);
        user2.addToCart(novel1);
        user2.addToCart(music3);
        user2.addToCart(academicBook1);

        // store
        ArrayList<User> userList = new ArrayList<>();
        ArrayList<Media> mediaList = new ArrayList<>();
        mediaList.add(book1);
        mediaList.add(novel1);
        mediaList.add(academicBook1);
        mediaList.add(music1);
        mediaList.add(music2);
        mediaList.add(music3);
        mediaList.add(movie1);
        mediaList.add(movie2);

        userList.add(user1);
        userList.add(user2);

        Store store = new Store(mediaList, userList);


        System.out.println("------------store------------");
        store.displayMedias();

        System.out.println("\n------------users------------");
        store.displayUsers();

        //checkout
        System.out.println("\n------------checkout------------");
        System.out.println("\nuser1:");
        printLists(user1.getShoppingCart());
        user1.checkOut();


        System.out.println("\nuser2:");
        printLists(user2.getShoppingCart());
        user2.checkOut();

        // music playlist
        System.out.println("\n------------playlists------------");
        ArrayList<Music> musicCatalog = new ArrayList<>();
        musicCatalog.add(music1);
        musicCatalog.add(music2);
        musicCatalog.add(music3);
        musicCatalog.add(music4);

        printLists(music1.generatePlaylist(musicCatalog));

        //movie playlist
        System.out.println("\n------------playlists------------");
        ArrayList<Movie> movieCatalog = new ArrayList<>();
        movieCatalog.add(movie1);
        movieCatalog.add(movie2);

        printLists(movie1.recommendSimilarMovies(movieCatalog));

        // restock
        System.out.println("\n------------restock------------");
        System.out.printf("stock before: %d\n",academicBook1.getStock());
        user2.addToCart(academicBook1);
        academicBook1.purchase(user2);
        System.out.printf("stock after: %d\n",academicBook1.getStock());

        System.out.println("stock added");
        academicBook1.restock(3);
        System.out.printf("stock after: %d\n",academicBook1.getStock());
    }
}
