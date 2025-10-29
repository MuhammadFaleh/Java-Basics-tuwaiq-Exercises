public class Main {
    static void main() {
        Book[] b = new Book[2];

        b[0] = new Book("book 1", 15.5,"author 1");
        b[1] = new Book("book 2", 25.5,"author 2");

        Movie[] m = new Movie[2];
        m[0] = new Movie("movie 1", 10, "director 1");
        m[1] = new Movie("movie 2", 5.99, "director 2");

        MovablePoint[] move = new MovablePoint[2];

        move[0] = new MovablePoint(10,15,5,5);
        move[1] = new MovablePoint(10,15,25,30);

        System.out.println("----------------Products----------------");
        for (int i =0; i<2; i++){
            System.out.printf("Name: %s \t Director: %s \t Price: %.2f $ \t Discounted price: %.2f $\n",
                    m[i].getName(),m[i].getDirector(), m[i].getPrice(), m[i].getDiscount()); // price discounted by 15

            System.out.printf("Name: %s \t Author: %s \t Price: %.2f $\t Discounted price: %.2f $\n",// price discounted by 25
                    b[i].getName(),b[i].getAuthor(), b[i].getPrice(), b[i].getDiscount());
        }

        System.out.println("\n----------------Moves X Y----------------");

        for (int i =0; i<2; i++){
            System.out.printf("X: %d \t Y: %d \t ",
                    move[i].getX(),move[i].getY());
            move[i].moveLeft();
            move[i].moveUp();
            System.out.printf("X after move: %d \t Y after move: %d \n",
                    move[i].getX(),move[i].getY());

        }
    }
}
