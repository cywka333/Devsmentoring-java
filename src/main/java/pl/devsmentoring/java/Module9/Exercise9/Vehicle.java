package pl.devsmentoring.java.Module9.Exercise9;

import java.util.Random;

public abstract class Vehicle {
    private int oilStatus;

    abstract void checkFuel();

    int oilStatusGenerator() {
        Random random = new Random();
        this.oilStatus = random.nextInt(51) + 50;
        System.out.println("Oil level: " + this.oilStatus);
        return this.oilStatus;
    }

    void checkOil()
    {
        if (oilStatus >= 80){
            System.out.println("Oil status is ok.");
        }else {
            System.out.println("Oil status is to small. Fill it.");
        }
    }

    protected void engineStart(){
        if (oilStatus >= 80) {
            System.out.println("Engine start. Comes from Vehicle class.");
        }else {
            System.out.println("You shouldn't start engine. Oil level is too low.");
        }
    }

}
