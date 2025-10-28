public class Media {
    private String title;
    private String author;
    private String iSBN;
    private double price;

    Media(String title, String author, String iSBN, double price){
        setTitle(title);
        setAuthor(author);
        setISBN(iSBN);
        setPrice(price);
    }

    public void setTitle(String title){
        if(title.length() >= 4){
            this.title = title;
        }else this.title = "";
    }
    public void setAuthor(String author){
        if(author.length() >= 4){
            this.author = author;
        }else this.author = "";

    }
    public void setISBN(String iSBN){
        if(iSBN == null){
            this.iSBN = "";
        }else if(iSBN.length() >= 10){
            this.iSBN = iSBN;
        }else this.iSBN = "";

    }
    public void setPrice(double price){
        try {
            if(price >= 0){ // for free media
                this.price = price;
            }else {
                this.price = 0;
                throw new Exception("Invalid price, price was set to 0");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.iSBN;
    }

    public double getPrice() {
        return this.price;
    }

    public String getMediaType(){
        return "Media ";
    }

    public String toString(){
        return String.format("Title: %s \t Author: %s \t ISBN: %s \t Price: %.2f",
                this.title,this.author,this.iSBN,this.price);
    }
}
