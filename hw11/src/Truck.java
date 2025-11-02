public class Truck implements Vehicle{
    private String type;
    private int weeks;
    static final double cost = 500;

    Truck(String type, int weeks){
        setWeeks(weeks);
        setType(type);
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public String getType() {
        return type;
    }

    @Override
    public double calculateRentalCost() {
        return cost * weeks;
    }

    @Override
    public String displayDetails() {
        return String.format("Truck Type: %s \tNumber of Weeks: %d \t Weekly Rate: %.1f \tRental Cost: %.1f \n",
                getType(), getWeeks(), cost, calculateRentalCost());
    }
}
