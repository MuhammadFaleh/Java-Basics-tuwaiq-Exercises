public class Circle extends Shape{

    private double radius;
    final private double pi = 22f/7f;

    Circle(double radius){
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double calculateArea() {
        return pi*Math.pow(radius, 2);
    }

    @Override
    public double calculateCircumference() {
        return 2 * pi * radius;
    }


    public String toString() {
        return String.format("A Circle with Radius: %.2f \t Area: %.2f \t Circumference: %.2f\n",
                getRadius(), calculateArea(), calculateCircumference());
    }
}
