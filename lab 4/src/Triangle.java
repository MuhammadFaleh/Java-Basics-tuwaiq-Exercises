public class Triangle extends Shape{

    private double height;
    private double width;

    Triangle(double height, double width){
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
        return (width*height) / 2;
    }

    @Override
    public double calculateCircumference() {
        return 3*width;
    }


    public String toString() {
        return String.format("A tringle with width: %.2f \t height: %.2f \t Area: %.2f \t Perimeter: %.2f\n",
                getWidth(), getHeight(), calculateArea(), calculateCircumference());
    }
}
