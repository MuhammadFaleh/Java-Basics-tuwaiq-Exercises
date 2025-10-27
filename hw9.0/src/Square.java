public class Square extends Rectangle{
    Square(){
        // will be 1
    }

    Square(double side){
        setSide(side);
    }
    Square(double side, String color, boolean filled){
        super(side,side, color, filled); // this would allow for rectangle to be reused
        setSide(side);
    }

    public void setSide(double side){
        super.setLength(side); // allowing to keep getArea and getPerimeter the same
        super.setWidth(side);
    }

    public double getSide(){
        return super.getLength();
    }

    // reuse getArea , getPerm
    // but if didn't use setLength and setWidth to the same side overriding both area and perm is necessary

    @Override
    public String toString(){
        return String.format("A Square with side = %.1f, which is a subclass %s %s\n",
                super.getLength(), super.toString()
                        .split(",")[0],super.toString()
                        .split(",")[2]);
    }
}
