public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    Rectangle(double width, double length){
        setLength(length);
        setWidth(width);
    }
    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        setLength(length);
        setWidth(width);
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public void getArea(){
        System.out.printf("Area = %f\n", this.length * this.width);
    }

    public void getPerimeter(){
        System.out.printf("Perimeter = %f\n", 2*(this.length + this.width));
    }
    @Override
    public String toString(){
        return String.format("A Rectangle with width = %.1f, and length= %.1f, \nwhich is a subclass of: %s\n",
                this.width, this.length, super.toString());
    }
}
