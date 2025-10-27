import java.util.InputMismatchException;

public class Shape {
    boolean filled;
    String color;

    Shape(){
        this.color = "green";
        this.filled = true;
    }

    Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public void setColor(String color){
        try {
            if(color == null){
                throw new Exception("null value");
            }
            if(!color.matches("[A-Za-z]+")){
                throw new Exception("enter only letters");
            }
            this.color = color;
        }catch (InputMismatchException e){
            System.out.println("enter only Strings");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void setFilled(boolean filled){

        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    public String toString(){
        String filled = "";
        if(isFilled()){
           filled = "filed";
        }else filled = "not filed";
        return String.format("a Shape with the color %s and is %s\n", getColor(), filled);
    }
}
