package pl.devsmentoring.java.Module9.Exercise9;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Tram tram1 = new Tram(20);
        Tram tram2 = new Tram(11);
        Tram tram3 = new Tram(3);

        Car car1 = new Car(3);
        Car car2 = new Car(5);
        Car car3 = new Car(1);

        Motorcycle motorcycle1 = new Motorcycle("Kawasaki");
        Motorcycle motorcycle2 = new Motorcycle("Honda");
        Motorcycle motorcycle3 = new Motorcycle("Yamaha");


        ArrayList<Object> vehiclesList = new ArrayList<>();

        vehiclesList.add(tram1);
        vehiclesList.add(tram2);
        vehiclesList.add(tram3);

        vehiclesList.add(car1);
        vehiclesList.add(car2);
        vehiclesList.add(car3);

        vehiclesList.add(motorcycle1);
        vehiclesList.add(motorcycle2);
        vehiclesList.add(motorcycle3);


        Tram myTram1 = (Tram) vehiclesList.get(0);
        myTram1.oilStatusGenerator();
        myTram1.checkOil();
        myTram1.tramNumberDisplay();
        separator();

        Tram myTram2 = (Tram) vehiclesList.get(1);
        myTram2.oilStatusGenerator();
        myTram2.checkOil();
        myTram2.engineStart();
        separator();

        Car myCar1 = (Car) vehiclesList.get(3);
        myCar1.turnOffStartStop();
        myCar1.doorNumberResult();
        myCar1.oilStatusGenerator();
        myCar1.engineStart();
        separator();

        Car myCar2 = (Car) vehiclesList.get(4);
        myCar2.oilStatusGenerator();
        myCar2.checkFuel();
        myCar2.engineStart();
        separator();

        Motorcycle myMotorcycle1 = (Motorcycle) vehiclesList.get(6);
        motorcycle1.oilStatusGenerator();
        myMotorcycle1.engineStart();
        myMotorcycle1.motorcycleBrand();

    }

    static void separator(){
        System.out.println("----------------------------------");
    }
}
