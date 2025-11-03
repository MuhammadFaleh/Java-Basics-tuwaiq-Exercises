public class Main {
    static void main() {

        // menu test
        BookingSystem booking = new BookingSystem();
        booking.menu();


        // quick test
        Route route1 = new Route("Riyadh", "Jeddah", 500);
        Route route2 = new Route("Riyadh", "Al-Qassim", 300);

        Car car1 = new Car("Car1", route1, 4, "Small Car");
        Car car2 = new Car("Car2", route2, 0, "Small Car");

        Subscribers sub1 = new Subscribers("ahmed","123", car1);

        Subscribers sub2 = new Subscribers("mohammed", "122", car2);

        NonSubscribers non1 = new NonSubscribers("khaild", "144", car1,true);
        NonSubscribers non2 = new NonSubscribers("abdullah", "155", car1, false);

        System.out.printf("%s\n%s\n%s\b%s\n%s\n%s\n%s\n%s",
                route1.displayInfo(),route2.displayInfo(),car1.displayInfo(),car2.displayInfo(),
        sub1.displayInfo(),sub2.displayInfo(),non1.displayInfo(),non2.displayInfo());
    }

}
