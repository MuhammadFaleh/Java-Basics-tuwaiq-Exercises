public class Circle extends Shape{
    public double radius;
    Circle(){
        this.radius = 1.0;
    }

    Circle(double radius){
        setRadius(radius);
    }

    Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return 3.14 * Math.pow(this.radius,2);
    }

    public double getPerimeter(){
        return 2 * this.radius * 3.14;
    }
    @Override
    public String toString(){
        return String.format("A Circle with radius = %.1f, which is a subclass: %s\n",
                this.radius, super.toString());
    }
}
