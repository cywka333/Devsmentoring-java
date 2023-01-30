package pl.devsmentoring.java.Module8.Exercise4;


import java.util.ArrayList;
import java.util.List;

public class BusDepot extends Depot {
    int busesFuelMonthlyUsage;
    public BusDepot(String name) {
        super(name);
    }
    private List<Bus> buses = new ArrayList<>();

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public int sumMonthlyUsage() {
        for (Bus bus : buses) {
            busesFuelMonthlyUsage += bus.getFuelMonthlyUsage();
        }
        return busesFuelMonthlyUsage;
    }

}
