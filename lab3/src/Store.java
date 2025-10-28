import java.util.ArrayList;

public class Store {
    private ArrayList<Media> listMedia = new ArrayList<>();
    private ArrayList<User> listUser = new ArrayList<>();

    public Store(ArrayList<Media> media, ArrayList<User> user) {
        setMedia(media);
        setUser(user);
    }

    public void addUser(User u){
        this.listUser.add(u);
    }

    public void addMedia(Media m){
        this.listMedia.add(m);
    }

    public void setMedia(ArrayList<Media> media) {
        if(media != null) {
            this.listMedia = media;
        }else {
            System.out.println("please enter a list of medias");
        }
    }

    public void setUser(ArrayList<User> user) {
        if(user != null) {
            this.listUser = user;
        }else {
            System.out.println("please enter a list of users");
        }
    }

    public ArrayList<Media> getMedia() {
        return listMedia;
    }

    public ArrayList<User> getUser() {
        return listUser;
    }

    public void displayUsers(){
        for(User u: listUser){
            System.out.println(u.toString());
        }
    }

    public void displayMedias(){
        for(Media m: listMedia){
            System.out.println(m.toString());
        }
    }

    public Book searchBook(String title){
        for (Media m: this.listMedia){
            if (m instanceof Book && m.getTitle().equalsIgnoreCase(title)){
                return ((Book)m);
            }
        }
        return null;
        }
    }