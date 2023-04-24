package pl.devsmentoring.java.Module9.Exercise2;

public class BusDepot extends Depot {
    int busesFuelMonthlyUsage;
    public BusDepot() {
        this.name = "Bus Depot";
    }

    private void addFuelUsage(int gasUsage){
        busesFuelMonthlyUsage += gasUsage;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        Bus bus = (Bus) vehicle;
        this.vehicleList.add(bus);
        addFuelUsage(bus.getFuelMonthlyUsage());
    }

    public int getBusesFuelMonthlyUsage() {
        return busesFuelMonthlyUsage;
    }
}