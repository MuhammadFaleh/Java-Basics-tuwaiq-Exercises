public class BigCar extends Car{

    public BigCar(String code, Route route, int maxCapacity) {
        super(code, route, maxCapacity);
    }


    @Override
    public String displayInfo(){
        return String.format("%s \t Car Type: %s \t Seats Left: %d \t Car Type: Big \t Cost: %.1f",
                super.getRoute().displayInfo(), super.getAvailableSeats(), super.getCost() + 10);
    }


}
