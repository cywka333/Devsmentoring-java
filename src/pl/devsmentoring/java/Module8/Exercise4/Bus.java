package pl.devsmentoring.java.Module8.Exercise4;

public class Bus extends Vehicle {
    private int fuelMonthlyUsage;
    private final String vehicleType = "Bus";


    public Bus(int velocityMax, int vehicleNumber, int fuelMonthlyUsage) {
        super(velocityMax, vehicleNumber);
        this.fuelMonthlyUsage = fuelMonthlyUsage;
    }

    public int getFuelMonthlyUsage() {
        return fuelMonthlyUsage;
    }

    public void setFuelMonthlyUsage(int fuelMonthlyUsage) {
        this.fuelMonthlyUsage = fuelMonthlyUsage;
    }
    @Override
    void introduce() {
        System.out.println("Hello, I am " + this.vehicleType);
        super.introduce();
        System.out.println("My monthly usage of fuel is: " + this.fuelMonthlyUsage + "\n");
    }
}