package pl.devsmentoring.java.Module9.Exercise2;

import java.util.ArrayList;
import java.util.List;

public abstract class Depot {

    protected String name;

    protected List<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
    public void introduce(){
        System.out.println("This is: " + name + " ,this depot has few vehicles registered." + vehicleList);
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
}