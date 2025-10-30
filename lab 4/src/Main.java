import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner infoTaker = new Scanner(System.in);
    static double inputNumbers(String name){
        double number = 0;
        boolean valid = false;
        while(!valid){
            try {
                System.out.printf("%s", name);
                number = infoTaker.nextInt();
                infoTaker.nextLine();
                valid = true;
            } catch (InputMismatchException e){
                infoTaker.nextLine();
                System.out.println("please enter a number like 0, 1, 2\n");
            }
        }
        return number;
    }

    static void menu(){
        int menuChoice = 0;
        double height;
        double width;
        boolean loopFlag = true;
        while(loopFlag){
            System.out.println("1- calculate for a retangle\n2- calculate for a Circle " +
                    "\n3- calculate for Triangle\n4- exit");
            menuChoice = (int) inputNumbers("input: ");
            switch (menuChoice){
                case 1:
                    height = inputNumbers("enter the height: ");
                    width = inputNumbers("enter the width: ");
                    Rectangle r = new Rectangle(height, width);
                    System.out.println(r.toString());
                    break;
                case 2:
                    width = inputNumbers("radius: ");
                    Circle c = new Circle(width);
                    System.out.println(c.toString());
                    break;
                case 3:
                    height = inputNumbers("enter the height: ");
                    width = inputNumbers("enter the width: ");
                    Triangle t = new Triangle(height,width);
                    System.out.println(t.toString());
                    break;
                case 4:
                    loopFlag = false;
                    break;
                default:
                    System.out.println("enter one from the menu");
                    break;
            }
        }
    }

    static void main() {
        menu();

        // for quick test
        Triangle t = new Triangle(24,18);
        Rectangle r = new Rectangle(24, 15);
        Circle c = new Circle(4);

        System.out.println(t.toString());
        System.out.println(r.toString());
        System.out.println(c.toString());

    }


}
