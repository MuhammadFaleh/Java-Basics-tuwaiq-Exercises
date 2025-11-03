public abstract class Passenger {
    private String name;
    private String id;
    private Car reservedCar;
    private double tripCost;

    Passenger(String name, String id, Car reservedCar){
        setName(name);
        setId(id);
        setReservedCar(reservedCar);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
        reservedCarCost(reservedCar);
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public String getName() {
        return name;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public String getId() {
        return id;
    }

    abstract double reservedCarCost(Car car);

    abstract public String displayInfo();
}
