public class Bike implements Vehicle{
    private String brand;
    private int hours;
    static final double cost = 10;

    Bike(String brand, int hours){
        setHours(hours);
        setBrand(brand);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHours() {
        return hours;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public double calculateRentalCost() {
        return cost * hours;
    }

    @Override
    public String displayDetails() {
        return String.format("Bike Brand: %s \t Number of Hours: %d \t Hourly Rate: %.1f\t Rental Cost: %.1f\n",
                getBrand(), getHours(), cost, calculateRentalCost());
    }
}
