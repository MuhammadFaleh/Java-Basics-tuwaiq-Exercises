import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleRentalSystem {
    private ArrayList<Vehicle> cart = new ArrayList<>();
    static Scanner infoTaker = new Scanner(System.in);

    VehicleRentalSystem() {
    }


    static public void printItems(ArrayList<Vehicle> o) {
        int counter = 1;
        System.out.println();
        for (Vehicle item : o) {
            if (item instanceof Car) {
                System.out.printf("%d- %s\n", counter,((Car) item).displayDetails());
            } else if (item instanceof Bike){
                System.out.printf("%d- %s\n", counter, ((Bike) item).displayDetails());
            } else if (item instanceof Truck){
                System.out.printf("%d- %s\n", counter,((Truck) item).displayDetails());
            }
            counter++;
        }
        System.out.println();
    }

    static int inputNumbers(String name){

        int number = 0;
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

    public double getPrice(){
        double totalPrice = 0;
        for (Vehicle item : this.cart) {
            if (item instanceof Car){
                totalPrice += ((Car) item).calculateRentalCost();
            } else if (item instanceof Bike){
                totalPrice += ((Bike) item).calculateRentalCost();
            } else if (item instanceof Truck){
                totalPrice += ((Truck) item).calculateRentalCost();
            }
        }

        return totalPrice;
    }

    static String inputString(String name){

        String brand = "";
        System.out.printf("%s", name);
        brand = infoTaker.nextLine();

        return brand;
    }

    public void customVehicle(){
        boolean loopFlag = true;
        while(loopFlag){
            System.out.println("\n1- Rent a car" +
                    "\n2- Rent a Bike \n3- Rent a Truck\n4- view Rented vehicles" +
                    "\n5- exit");
            int choice = inputNumbers("Pick the Type: ");
            switch (choice){
                case 1:
                    choice = inputNumbers("enter the number of days: ");
                    if(choice >0 ){
                        Car c = new Car(inputString("enter car model: "), choice);
                        cart.add(c);
                        System.out.println("rented successfully");
                    }else System.out.println("Enter a valid input");
                    break;
                case 2:
                    choice = inputNumbers("enter the number of hours: ");
                    if(choice >0 ){
                        Bike b = new Bike(inputString("enter bike brand: "), choice);
                        cart.add(b);
                        System.out.println("rented successfully");
                    }else System.out.println("Enter a valid input");
                    break;
                case 3:
                    choice = inputNumbers("enter the number of weeks: ");
                    if(choice >0 ){
                        Truck t = new Truck(inputString("enter truck type: "), choice);
                        cart.add(t);
                        System.out.println("rented successfully");
                    }else System.out.println("Enter a valid input");
                    break;
                case 4:
                    printItems(cart);
                    System.out.printf("Total Price: %.1f\n", getPrice());
                    break;
                case 5:
                    System.out.println("thank you for using the rental system");
                    loopFlag = false;
                    break;
                default:
                    System.out.println("enter one from the menu");
                    break;
            }
        }
    }

    static void main() {
        VehicleRentalSystem v = new VehicleRentalSystem();
        v.customVehicle();
    }
    }
