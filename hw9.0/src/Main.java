public class Main {
    static void print(Object o[]){
        for (int i = 0; i<3; i++){
            System.out.printf("%s\n",
                    o[i].toString());
        }
        System.out.println("--------------------------------------");
    }
    static void main() {
        Shape s1[] = new Shape[3];
        s1[0] = new Shape("red", false);
        s1[1] = new Shape("blue", true);
        s1[2] = new Shape();
        print(s1);

        Rectangle r1[] = new Rectangle[3];
        r1[0] = new Rectangle(10, 5);
        r1[1] = new Rectangle(10,4,"blue", false);
        r1[2] = new Rectangle();
        print(r1);


        Circle c1[] = new Circle[3];
        c1[0] = new Circle(10);
        c1[1] = new Circle(4,"blue", false);
        c1[2] = new Circle();
        print(c1);

        Square sq1[] = new Square[3];
        sq1[0] = new Square(10);
        sq1[1] = new Square(4,"blue", false);
        sq1[2] = new Square();
        print(sq1);

    }
}
