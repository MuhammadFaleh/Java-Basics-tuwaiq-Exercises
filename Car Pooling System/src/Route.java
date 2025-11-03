public class Route {
    private String startAddress;
    private String endAddress;
    private double tripCost;

    public Route(String startAddress, String endAddress, double tripCost) {
        setStartAddress(startAddress);
        setEndAddress(endAddress);
        setTripCost(tripCost);
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public double getTripCost() {
        return tripCost;
    }

    public String displayInfo(){
        return String.format("Route from: %s  To  %s "
        ,startAddress, endAddress);
    }

}
