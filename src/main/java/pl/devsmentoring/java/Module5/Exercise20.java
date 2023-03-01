package pl.devsmentoring.java.Module5;

import java.util.*;

public class Exercise20 {
    public static void main(String[] args) {

        int colorCounter = 1;

        List<String> colourList = new ArrayList<>(Arrays.asList("zielony", "czerwony", "niebieski", "czarny",
                "fioletowy", "granatowy", "niebieski",
                "czarny", "czarny", "zielony", "cytrynowy", "granatowy",
                "niebieski", "indygo", "zielony", "czerwony"));

        System.out.println("Original length of our colour list was: " + colourList.size());

        Set<String> colorSet = new HashSet<>(colourList);
        System.out.println("Numbers of different colours in our list: " + colorSet.size());

        for (String colorDisplay : colorSet){
            System.out.println("Color number " + colorCounter + " is: " + colorDisplay);
            ++colorCounter;
        }

        colorSet.add("purpurowy");
        System.out.println("After adding colour purpurowy set looks like: " + colorSet.toString());

        colorSet.remove("niebieski");
        System.out.println("I removed colour niebieski. Now it looks like: " + colorSet.toString());

    }
}