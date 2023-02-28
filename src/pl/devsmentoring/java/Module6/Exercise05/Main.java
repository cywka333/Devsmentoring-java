package pl.devsmentoring.java.Module6.Exercise05;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.setMileage(100f);
        vehicle.setVelocityMax(200f);
        vehicle.displayVehicleInformation();
        System.out.println(" ");

        vehicle.setMileage(300f);
        vehicle.displayVehicleInformation();
    }
}
