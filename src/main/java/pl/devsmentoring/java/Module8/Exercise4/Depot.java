package pl.devsmentoring.java.Module8.Exercise4;


import java.util.ArrayList;
import java.util.List;

public class Depot {


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
