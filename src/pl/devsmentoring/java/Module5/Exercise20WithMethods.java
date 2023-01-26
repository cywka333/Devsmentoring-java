package pl.devsmentoring.java.Module5;

import java.util.*;

public class Exercise20WithMethods {
    public static void main(String[] args) {

        List<String> colourList = new ArrayList<>(Arrays.asList("zielony", "czerwony", "niebieski", "czarny",
                "fioletowy", "granatowy", "niebieski",
                "czarny", "czarny", "zielony", "cytrynowy", "granatowy",
                "niebieski", "indygo", "zielony", "czerwony"));

        colourCopy(colourList);
        System.out.println("In set we have " + colourSet.size() + " different colors.\n");
        displayColorsInNewLines(colourSet);
        System.out.println("");

        colorAdd(colourSet);
        System.out.println("");
        colorRemove(colourSet);
    }

    private static HashSet<String> colourSet = new HashSet<>();

    private static void colourCopy(List<String> colourList){
        for (String colour : colourList){
            colourSet.add(colour);
        }
    }

    private static void displayColorsInNewLines(HashSet<String>colourSet){
        int colourCounter = 1;
        for (String colourInNewLine : colourSet){
            System.out.println("Colour number " + colourCounter + " is: " + colourInNewLine);
            ++colourCounter;
        }
    }

    private static void colorAdd(HashSet<String>colourSet){
        colourSet.add("purpurowy");
        System.out.println("I added colour purpurowy. Now set looks like: " + colourSet);
    }

    private static void colorRemove(HashSet<String>colourSet){
        colourSet.remove("zielony");
        System.out.println("I removed zielony. Now set looks like: " + colourSet);
    }

}
