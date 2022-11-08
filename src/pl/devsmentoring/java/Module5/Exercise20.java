package pl.devsmentoring.java.Module5;

import java.util.*;

public class Exercise20 {
    public static void main(String[] args) {
        // 'zielony', 'czerwony', 'niebieski', 'czarny', 'fioletowy', 'granatowy', 'niebieski', 'czarny',
        // 'czarny', 'zielony', 'cytrynowy', 'granatowy', 'niebieski', 'indygo', 'zielony', 'czerwony'


        List<String> colourList = new ArrayList<>(Arrays.asList("zielony", "czerwony", "niebieski", "czarny",
                "fioletowy", "granatowy", "niebieski",
                "czarny", "czarny", "zielony", "cytrynowy", "granatowy",
                "niebieski", "indygo", "zielony", "czerwony"));


        System.out.println("Original length of our colour list was: " + colourList.size());


        Set<String> colourAsValues = new HashSet<>(colourList);
        System.out.println("In the list we have: " + colourAsValues.size() + " different colours.\n");

        // Printing all values from hashset in new lines
        for (String printingColours : colourAsValues){
            System.out.println(printingColours);
        }

        System.out.println(" ");

        // Adding new colour - purpurowy
        colourAsValues.add("purpurowy");
        for (String printingColours : colourAsValues){
            System.out.print(printingColours + "; ");
        }

        System.out.println(" ");

        // Removing one colour - niebieski
        colourAsValues.remove("niebieski");
        for (String printingColours : colourAsValues){
            System.out.print(printingColours + "; ");
        }

    }
}
