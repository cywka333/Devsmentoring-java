package pl.devsmentoring.java.Module5;

import java.util.*;

public class Exercise20 {
    public static void main(String[] args) {

        List<String> colourList = new ArrayList<>(Arrays.asList("zielony", "czerwony", "niebieski", "czarny",
                "fioletowy", "granatowy", "niebieski",
                "czarny", "czarny", "zielony", "cytrynowy", "granatowy",
                "niebieski", "indygo", "zielony", "czerwony"));

        int greenCounter = Collections.frequency(colourList, "zielony");
        int redCounter = Collections.frequency(colourList, "czerwony");
        int blueCounter = Collections.frequency(colourList, "niebieski");
        int blackCounter = Collections.frequency(colourList, "czarny");
        int purpleCounter = Collections.frequency(colourList, "fioletowy");
        int navyCounter = Collections.frequency(colourList, "granatowy");
        int lemonCounter = Collections.frequency(colourList, "cytrynowy");
        int indygoCounter = Collections.frequency(colourList, "indygo");

        System.out.println("Numbers of occurrences of colours in list: " + "\nZielony: " + greenCounter +
                            "\nCzerwony: " + redCounter + "\nNiebieski: " + blueCounter +  "\nCzarny: " + blackCounter +
                            "\nFioletowy: " + purpleCounter + "\nGranatowy: " + navyCounter + "\nCytrynowy: " + lemonCounter +
                            "\nIndygo: " + indygoCounter);


        System.out.println("Original length of our colour list was: " + colourList.size());

        Set<String> colourAsValues = new HashSet<>(colourList);
        System.out.println("In the list we have: " + colourAsValues.size() + " different colours.\n");

        for (String printingColours : colourAsValues){
            System.out.println(printingColours);
        }

        System.out.println(" ");

        colourAsValues.add("purpurowy");
        for (String printingColours : colourAsValues){
            System.out.print(printingColours + "; ");
        }

        System.out.println(" ");

        colourAsValues.remove("niebieski");
        for (String printingColours : colourAsValues){
            System.out.print(printingColours + "; ");
        }

    }
}