public class Car {
    private String code;
    private Route route;
    private int maxCapacity;
    private int availableSeats;
    private String type;

    public Car(String code, Route route, int maxCapacity, String type) {
        setCode(code);
        setRoute(route);
        setMaxCapacity(maxCapacity);
        setAvailableSeats(maxCapacity);
        setType(type);

    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public Route getRoute() {
        return route;
    }


    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getCost(){
        return route.getTripCost();
    }

    public String getType() {
        return type;
    }

    public void reduceCapacity(){
        this.availableSeats--;
    }

    public boolean hasCapacity(){
        return availableSeats > 0;
    }

    public String displayInfo(){
        return String.format("%s \t Type: %s \t Seats Left: %d",
                route.displayInfo(), type,availableSeats);
    }

}
