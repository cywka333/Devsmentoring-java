package pl.devsmentoring.java.Module8.Exercise4;

public class BusDepot {
    public static void main(String[] args) {
        final String busDepotName = "Bus Depot";
        int fuelMonthlyUsage;
        Bus bus1 = new Bus(200, 2, 5000);
        Bus bus2 =  new Bus(230, 3, 2000);
        Bus bus3 = new Bus(222, 4, 3000);

        System.out.println("Welcome to " + busDepotName);
        bus1.introduce();
        bus2.introduce();
        bus3.introduce();

        fuelMonthlyUsage = bus1.getFuelMonthlyUsage() + bus2.getFuelMonthlyUsage() + bus3.getFuelMonthlyUsage();

        System.out.println("Our all monthly usage of fuel is: " + fuelMonthlyUsage);
    }

}
