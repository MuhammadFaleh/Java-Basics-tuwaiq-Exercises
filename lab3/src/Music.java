import java.util.ArrayList;

public class Music extends Media{
    private String artist;

    public Music(String title, String artist, double price) {
        super(title, artist, null, price); //since artist is the same as author
        setArtist(artist);
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user){ // guessing this acts as purchase but for music
        ArrayList<Media> removed = new ArrayList<>();

        boolean hasMusic = false;
        for(Media m : user.getShoppingCart()){
            if(m instanceof Music){
                hasMusic = true;
                user.getPurchaseMediaList().add(m);
                removed.add(m);
            }
        }

        for(Media m: removed){
            user.removeFromCart(m);
        }
        if(hasMusic) System.out.println("Music Track/s purchased successfully");

    }

    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog){
        ArrayList<Music> playList = new ArrayList<>();
        for (Music track: musicCatalog){
            if(track.artist.equalsIgnoreCase(this.artist)){
                playList.add(track);
            }
        }
        return playList;
    }
    @Override
    public String getMediaType(){
        if(super.getPrice() >= 10){
            return "Premium Music";
        }else return "Music";
    }
    @Override
    public String toString(){
        return String.format("Title: %s \t Artist: %s \t Type: %s \t Price: %.2f",
                super.getTitle(), this.artist,getMediaType(),super.getPrice());
    }
}
