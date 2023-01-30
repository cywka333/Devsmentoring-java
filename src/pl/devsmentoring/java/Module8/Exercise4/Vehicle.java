package pl.devsmentoring.java.Module8.Exercise4;

public class Vehicle {
    protected int velocityMax;
    protected int vehicleNumber;

    public Vehicle(int velocityMax, int vehicleNumber){
        this.velocityMax = velocityMax;
        this.vehicleNumber = vehicleNumber;
    }
    void introduce(){
        System.out.println("My velocity max is: " + this.velocityMax);
        System.out.println("My number is: " + this.vehicleNumber);
    }

    public int getVelocityMax() {
        return velocityMax;
    }


    public int getVehicleNumber() {
        return vehicleNumber;
    }

}