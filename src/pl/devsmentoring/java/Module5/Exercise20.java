package pl.devsmentoring.java.Module5;

import java.util.*;

public class Exercise20 {
    public static void main(String[] args) {

        List<String> colourList = Arrays.asList("zielony", "czerwony", "niebieski", "czarny",
                "fioletowy", "granatowy", "niebieski",
                "czarny", "czarny", "zielony", "cytrynowy", "granatowy",
                "niebieski", "indygo", "zielony", "czerwony");

        System.out.println("Original length of our colour list was: " + colourList.size());


        Map<String, Integer> colorCounts = new HashMap<>();
        for (String color : colourList) {
            colorCounts.putIfAbsent(color, 0);
            colorCounts.put(color, colorCounts.get(color) + 1);
        }

        for (Map.Entry<String, Integer> entry : colorCounts.entrySet()) {
            System.out.println("Colour numbers of occurrences: " + entry.getKey() + " - " + entry.getValue());
        }


        Set<String> colourAsValues = new HashSet<>(colourList);
        System.out.println("In the list we have: " + colourAsValues.size() + " different colours.\n");

        for (String printingColours : colourAsValues) {
            System.out.println(printingColours);
        }

        System.out.println(" ");

        colourAsValues.add("purpurowy");
        for (String printingColours : colourAsValues) {
            System.out.print(printingColours + "; ");
        }

        System.out.println(" ");

        colourAsValues.remove("niebieski");
        for (String printingColours : colourAsValues) {
            System.out.print(printingColours + "; ");
        }

    }

}