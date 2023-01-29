package pl.devsmentoring.java.Module5.Exercise20WithHashMap;

import java.util.*;

public class ColorList {
    private List<String> colorList = Arrays.asList("zielony", "czerwony", "niebieski", "czarny",
                                                    "fioletowy", "granatowy", "niebieski", "czarny",
                                                    "czarny", "zielony", "cytrynowy", "granatowy",
                                                    "niebieski", "indygo", "zielony", "czerwony");
    private Map<String, Integer> colorMap = new HashMap<>();

    public void transformToMap() {
        for (String color : colorList) {
            if (colorMap.containsKey(color)) {
                colorMap.put(color, colorMap.get(color) + 1);
            } else {
                colorMap.put(color, 1);
            }
        }
    }

    public void displayCounts() {
        System.out.println("Count of colors in the original list: " + colorList.size());
        System.out.println("Count of unique colors in the original list: " + colorMap.size());
    }

    public void displayColors() {
        System.out.println("Colors in the map:");
        for (Map.Entry<String, Integer> entry : colorMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public void addColor(String color) {
        if (colorMap.containsKey(color)){
            colorMap.put(color, colorMap.get(color) + 1);
        }else {
            colorMap.put(color, 1);
        }
    }

    public void removeColor(String color) {
        if (colorMap.containsKey(color)){
            colorMap.remove(color);
        }else {
            System.out.println("Color doesn't exist in list");
        }
    }

}
