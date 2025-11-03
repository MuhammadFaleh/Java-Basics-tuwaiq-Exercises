import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookingSystem {
    private Passenger user;
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Route> routes = new ArrayList<>();
    final static String[] routesNames = {"North Town", "West Town", "Down Town", "East Town", "South Town"};
    BookingSystem(){
        setRoutes();
        setCars();
        setUser();
    }

    public void setUser() {

        this.user = makeUser();
    }

    public void addCars(ArrayList<Car> cars) {
        this.cars.addAll(cars);
    }

    public void setRoutes(){
        int price;
        //"North Town" 0 , "West Town" 1, "Down Town" 2, "East Town" 3, "South Town" 4
        for(int i = 0; i < routesNames.length; i++){
            for (int j = 0; j < routesNames.length ; j++) {
                if(i == j){
                    price = 10;
                }else if(i == 2 || j ==2){
                    price = 25;
                }else if(i == 0 && ( j ==1 || j == 3)){
                    price = 25;
                }else if(i == 4 && ( j ==1 || j == 3)){
                    price = 25;
                } else price =50;
                routes.add(new Route(routesNames[i], routesNames[j], price));
            }
        }
    }

    public void setCars() {
        for (Route route: routes){
            cars.add(new Car(String.format("%s-To-%s",route.getStartAddress(), route.getEndAddress()),
                    route, 4));
        }
    }


    static public void printItems(ArrayList<?> o) {
        int counter = 1;
        System.out.println();
        for (Object o1 : o) {
            if (o1 instanceof Car) {
                System.out.printf("%d- %s\n", counter, ((Car) o1).displayInfo());
            } else if(o1 instanceof Passenger){
                System.out.printf("%d- %s\n", counter, ((Passenger) o1).displayInfo());
            }else if(o1 instanceof String){
                System.out.printf("%d- %s\n", counter, o1);
            }
            counter++;
        }
        System.out.println();
    }



    static int inputNumbers(String name){
        Scanner infoTaker = new Scanner(System.in);
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

    static String inputNames(String word){
        Scanner infoTaker = new Scanner(System.in);
        String name = "";
        boolean valid = false;
        while(!valid){
            try {
                System.out.printf("%s", word);
                name = infoTaker.nextLine();
                valid = true;
            } catch (InputMismatchException e){
                System.out.println("please enter a number like 0, 1, 2\n");
            }
        }
        return name;
    }

    public Passenger makeUser(){
        Passenger user = null;
        while(user  == null){
            boolean coupon = false;

            int choice = inputNumbers("would you Like to Subscribe" +
                    "\n1-Yes\n2- No\n input: ");
            if( choice == 1) {
                user = new Subscribers(inputNames("Enter your name: "), inputNames("Enter ID: "), null);
            } else if(choice == 2){
                if(inputNumbers("Do you have a coupon \n1-Yes\n2- No\n") == 1) {
                    coupon = true;
                }
                user = new NonSubscribers(inputNames("Enter your name:"), inputNames("Enter ID: "), null, coupon);
            }else System.out.println("pick from the list");
        }
        return user;
    }
    public void pickRoute(){
        if(user.getReservedCar() == null) {
            String[] choiceRoutes = new String[2];

            System.out.println("Pick starting location:");
            printItems(new ArrayList<>(Arrays.asList(routesNames)));
            int startPick = inputNumbers("input: ");

            if (startPick > 0 && startPick <= routesNames.length) {
                choiceRoutes[0] = routesNames[startPick - 1];
            } else {
                System.out.println("please pick from the list");
                return;
            }

            System.out.println("\nPick destination:");
            printItems(new ArrayList<>(Arrays.asList(routesNames)));
            int endPick = inputNumbers("input: ");

            if (endPick > 0 && endPick <= routesNames.length) {
                choiceRoutes[1] = routesNames[endPick - 1];
            } else {
                System.out.println("please pick from the list");
                return;
            }

            bookCar(choiceRoutes);

        } else {
            System.out.println("You have a booking already");
            System.out.println(user.displayInfo());
            if(inputNumbers("Would you like to change it?\n1- Yes\n2- No\ninput: ") == 1){
                user.getReservedCar().setAvailableSeats(user.getReservedCar().getAvailableSeats() + 1);
                user.setReservedCar(null);
                pickRoute();
            } else {
                System.out.println("Thank you your booking was not changed");
            }
        }
    }

    public void bookCar(String[] choiceRoutes){
        for(Car car : cars) {
            Route route = car.getRoute();
            if(route.getStartAddress().equalsIgnoreCase(choiceRoutes[0]) &&
                    route.getEndAddress().equalsIgnoreCase(choiceRoutes[1]) ||
                    route.getStartAddress().equalsIgnoreCase(choiceRoutes[1]) &&
                            route.getEndAddress().equalsIgnoreCase(choiceRoutes[0])) {
                user.setReservedCar(car);
                System.out.println("Booking made successfully!");
                System.out.println(user.displayInfo());
                return;
            }
        }
    }


    public void menu(){
        int menuChoice = 0;
        int pick = 0;
        boolean loopFlag = true;
        while(loopFlag){

            System.out.println("\n1- Book a Car\n"+
                    "\n2- view booked trip \n3- exit\n");
            menuChoice = inputNumbers("input: ");
            switch (menuChoice){
                case 1:
                    pickRoute();
                    break;
                case 2:
                    System.out.println(user.displayInfo());
                    break;
                case 3:
                    loopFlag = false;
                    break;
                default:
                    System.out.println("enter one from the menu");
                    break;
            }
        }
    }
}
