import java.util.ArrayList;

public class User {
    private String userName;
    private String email;
    private ArrayList<Media> purchaseMediaList = new ArrayList<>();
    private ArrayList<Media> shoppingCart = new ArrayList<>();

    public User(String userName, String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart) {
        setUserName(userName);
        setEmail(email);
        setPurchaseMediaList(purchaseMediaList);
        setShoppingCart(shoppingCart);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        if(email.contains("@")){
            this.email = email;
        }else System.out.println("Enter a correct email");
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
        if(purchaseMediaList != null) {
            this.purchaseMediaList = purchaseMediaList;
        }
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        if(shoppingCart != null) {
            this.shoppingCart = shoppingCart;
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void addToCart(Media m){
        this.shoppingCart.add(m);
    }

    public void removeFromCart(Media m){
        this.shoppingCart.remove(m);
    }

    public void checkOut(){
        ArrayList<Media> cart = new ArrayList<>(shoppingCart); // to avoid Modification Exception
        for (Media m: cart){ // below function would update shpoingcart
            if (m instanceof Book){
                ((Book) m).purchase(this);
            }else if(m instanceof Movie){
                ((Movie) m).watch(this);
            }else if(m instanceof Music){
                ((Music) m).listen(this);
            }
        }
        System.out.println("Purchase done successfully");
    }

    @Override
    public String toString() {
        return String.format("Username: %s \t Email: %s \t Purchased: %d Items \t Cart: %d items",
                userName, email, purchaseMediaList.size(), shoppingCart.size());
    }
}
