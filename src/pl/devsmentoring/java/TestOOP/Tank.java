package pl.devsmentoring.java.TestOOP;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Tank  {

    List<Event> eventsList = new ArrayList<>();
    public static List<Tank> tanks = new ArrayList<>();
    private String name;
    private double capacity;
    private double currentVolume;

    public Tank(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
        this.currentVolume = 0;
        tanks.add(this);
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
            eventsList.add(new Event(LocalDateTime.now(), getName(), "pourWater", volume, true));
        } else {
            System.out.println("Cannot pour water more than tank capacity");
            eventsList.add(new Event(LocalDateTime.now(), getName(), "pourWater", volume, false));
        }
    }

    public void pourOutWater(double volume) {
        if (currentVolume - volume >= 0) {
            currentVolume -= volume;
            eventsList.add(new Event(LocalDateTime.now(), getName(), "pourOutWater", volume, true));
        } else {
            System.out.println("Cannot pour out more water than present in the tank");
            eventsList.add(new Event(LocalDateTime.now(), getName(), "pourOutWater", volume, false));
        }
    }

    public void transferWater(Tank from, double volume) {
        if (from.getCurrentVolume() >= volume) {
            from.pourOutWater(volume);
            pourWater(volume);
            eventsList.add(new Event(LocalDateTime.now(), getName(), "transferWater", volume, true));
        } else {
            System.out.println("Cannot transfer water more than present in the source tank");
            eventsList.add(new Event(LocalDateTime.now(), getName(), "transferWater", volume, false));
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

    public static String countFailedOperations() {
        Map<String, Integer> failedOperationsCount = new HashMap<>();
        for (Tank tank : tanks) {
            for (Event event : tank.eventsList) {
                if (!event.isOperationSuccessful()) {
                    String tankName = tank.getName();
                    Integer count = failedOperationsCount.get(tankName);
                    if (count == null) {
                        count = 0;
                    }
                    failedOperationsCount.put(tankName, count + 1);
                }
            }
        }

        int maxFailedOperations = 0;
        String tankWithMostFailedOperations = "";
        for (Map.Entry<String, Integer> entry : failedOperationsCount.entrySet()) {
            if (entry.getValue() > maxFailedOperations) {
                maxFailedOperations = entry.getValue();
                tankWithMostFailedOperations = entry.getKey();
            }
        }
        return tankWithMostFailedOperations;
    }

    public static Tank mostOperationsOfGivenType(String operationType) {
        int maxCount = 0;
        Tank tankWithMostOperations = tanks.get(0);
        for (Tank tank : tanks) {
            int count = 0;
            for (Event event : tank.eventsList) {
                if (event.getOperationType().equals(operationType) && event.isOperationSuccessful()) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                tankWithMostOperations = tank;
            }
        }
        return tankWithMostOperations;
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