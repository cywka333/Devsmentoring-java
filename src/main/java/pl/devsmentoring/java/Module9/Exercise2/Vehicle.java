package pl.devsmentoring.java.Module9.Exercise2;

public abstract class Vehicle implements infoGetter {
    protected int velocityMax;
    protected int vehicleNumber;

    public Vehicle(int velocityMax, int vehicleNumber){
        this.velocityMax = velocityMax;
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public int getVelocityMax() {
        return velocityMax;
    }

    @Override
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public void introduce() {
        System.out.println("My velocity max is: " + this.velocityMax);
        System.out.println("My number is: " + this.vehicleNumber);
    }


}