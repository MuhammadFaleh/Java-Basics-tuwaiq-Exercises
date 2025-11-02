public class Car implements Vehicle{
    private String model;
    private int days;
    static final double cost = 50;
    Car(String model, int days){
        setDays(days);
        setModel(model);
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public String getModel() {
        return model;
    }

    @Override
    public double calculateRentalCost() {
        return cost * days;
    }

    @Override
    public String displayDetails() {
        return String.format("Car Model: %s \t Number of Days: %d" +
                        "\t Daily Rate: %.1f\t Rental Cost: %.1f\n ",
                getModel(), getDays(), cost, calculateRentalCost());
    }
}
