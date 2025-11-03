public class Subscribers extends Passenger{
    static final double discount = .50;


    Subscribers(String name, String id, Car reservedCar) {
        super(name, id, reservedCar);
    }

    @Override
    double reservedCarCost(Car car) {
        int added = 0;
        if(car == null) {
            return 0;
        }
        try {
            if(car.hasCapacity()){
                car.reduceCapacity();
                super.setTripCost((car.getCost() * discount) + added);
                return super.getTripCost();
            } else {
               throw  new Exception("Sorry no seats left, please book another trip");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return super.getTripCost();
        }
    }

    @Override
    public String displayInfo(){
        if(super.getTripCost() == 0){
            return "No car was booked";
        }
        return String.format(
                "Booking information:\n" +
                    "Name: %s \t ID: %s \t %s \t Cost: %s",
                getName(), getId(), super.getReservedCar().displayInfo(), super.getTripCost()
        );
    }
}
