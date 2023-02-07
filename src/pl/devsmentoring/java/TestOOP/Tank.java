package pl.devsmentoring.java.TestOOP;

import java.util.ArrayList;
import java.util.List;

abstract class Tank {
    private String name;
    private double capacity;
    private double currentVolume;

    public Tank(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
        this.currentVolume = 0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public void pourWater(double volume) {
        if (currentVolume + volume <= capacity) {
            currentVolume += volume;
        } else {
            System.out.println("Cannot pour water more than tank capacity");
        }
    }

    public void pourOutWater(double volume) {
        if (currentVolume - volume >= 0) {
            currentVolume -= volume;
        } else {
            System.out.println("Cannot pour out more water than present in the tank");
        }
    }

    public void transferWater(Tank from, double volume) {
        if (from.getCurrentVolume() >= volume) {
            from.pourOutWater(volume);
            pourWater(volume);
        } else {
            System.out.println("Cannot transfer water more than present in the source tank");
        }
    }


    public static Tank findTankWithMostWater(List<Tank> tanks) {
        Tank tankWithMostWater = tanks.get(0);
        for (Tank tank : tanks) {
            if (tank.getCurrentVolume() > tankWithMostWater.getCurrentVolume()) {
                tankWithMostWater = tank;
            }
        }
        return tankWithMostWater;
    }

    public static Tank findTankWithMostWaterFilled(List<Tank> tanks) {
        Tank tankWithMostWaterFilled = tanks.get(0);
        for (Tank tank : tanks) {
            if (tank.getCurrentVolume() / tank.getCapacity() > tankWithMostWaterFilled.getCurrentVolume() / tankWithMostWaterFilled.getCapacity()) {
                tankWithMostWaterFilled = tank;
            }
        }
        return tankWithMostWaterFilled;
    }

    public static List<String> findEmptyTanks(List<Tank> tanks) {
        List<String> emptyTanks = new ArrayList<>();
        for (Tank tank : tanks) {
            if (tank.getCurrentVolume() == 0) {
                emptyTanks.add(tank.getName());
            }
        }
        return emptyTanks;
    }

}