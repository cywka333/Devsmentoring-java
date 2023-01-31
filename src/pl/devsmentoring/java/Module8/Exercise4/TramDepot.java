package pl.devsmentoring.java.Module8.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class TramDepot extends Depot {

    int allWagonNo;

    public TramDepot() {
        this.name = "Tram Depot";
    }

    private void addWagonNumbers(int wagonNo) {
        this.allWagonNo += wagonNo;
    }

    public int getAllWagonNo() {
        return allWagonNo;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        Tram tram = (Tram) vehicle;
        this.vehicleList.add(tram);
        addWagonNumbers(tram.getWagonNo());
    }

    @Override
    public List<Vehicle> getVehicleList() {
        return super.getVehicleList();
    }
}


