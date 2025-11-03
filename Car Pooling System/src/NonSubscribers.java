public class NonSubscribers extends  Passenger{
    private boolean discountCoupon;
    NonSubscribers(String name, String id, Car reservedCar, boolean discountCoupon) {
        super(name, id, reservedCar);
        setDiscountCoupon(discountCoupon);
        reservedCarCost(reservedCar);
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    public boolean getDiscountCoupon() {
        return this.discountCoupon;
    }
    @Override
    double reservedCarCost(Car car) {
        int added = 0;
        if(car == null) {
            return 0;
        }
        try {
            if(car.getType().equalsIgnoreCase("big car")){
                added = 15; // if car is big
            }
            if(car.hasCapacity()){

                car.reduceCapacity();
                if(discountCoupon) {
                    super.setTripCost((car.getCost() + added - car.getCost() + added * .10));
                }else super.setTripCost(car.getCost() + added);
            } else {
                throw  new Exception("Sorry no seats left, please book another trip");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
        return super.getTripCost();
    }

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
