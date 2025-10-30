public class Rectangle extends Shape {

    private double height;
    private double width;

    Rectangle(double height, double width){
        setHeight(height);
        setWidth(width);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }


    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculateCircumference() {
        return 2*(height + width);
    }

    public String toString() {
        return String.format("A Rectangle with width: %.2f \t height: %.2f \t Area: %.2f \t Circumference: %.2f\n",
                getWidth(), getHeight(), calculateArea(), calculateCircumference());
    }
}
