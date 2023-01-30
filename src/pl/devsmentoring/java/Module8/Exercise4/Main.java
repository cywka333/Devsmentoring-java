package pl.devsmentoring.java.Module8.Exercise4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus(30, 1, 2000);
        Bus bus2 = new Bus(40, 2, 3000);
        Bus bus3 = new Bus(50, 3, 4000);

        Tram tram1 = new Tram(20, 10, 2);
        Tram tram2 = new Tram(25, 20, 1);
        Tram tram3 = new Tram(30, 30, 3);
        Tram tram4 = new Tram(50, 40, 5);

        bus1.introduce();
        bus2.introduce();

        tram1.introduce();
        tram2.introduce();
        tram4.introduce();

        BusDepot busDepot = new BusDepot("Bus Depot");
        TramDepot tramDepot = new TramDepot("Tram Depot");

        busDepot.addBus(bus1);
        busDepot.addBus(bus2);
        busDepot.addBus(bus3);

        tramDepot.addTram(tram1);
        tramDepot.addTram(tram2);
        tramDepot.addTram(tram3);
        tramDepot.addTram(tram4);

        List<Bus> buses = busDepot.getBuses();
        System.out.println("Buses in " + busDepot.getName() + ":");
        for (Bus bus : buses) {
            System.out.println("Vehicle number: " + bus.getVehicleNumber());
            System.out.println("Velocity mas: " + bus.getVelocityMax());
            System.out.println("Monthly fuel usage: " + bus.getFuelMonthlyUsage());
        }

        System.out.println("Summary of fuel monthly usage of all buses is: " + busDepot.sumMonthlyUsage());

        List<Tram> trams = tramDepot.getTrams();
        System.out.println("\nTrams in " + tramDepot.getName() + ":");
        for (Tram tram : trams) {
            System.out.println("Number: " + tram.getVehicleNumber());
            System.out.println("Wagons number: " + tram.getWagonNo());
            System.out.println("Velocity max: " + tram.getVelocityMax());
        }

        System.out.println("Number of all wagons in tram depot : " + tramDepot.sumWagonNo());

    }
}
