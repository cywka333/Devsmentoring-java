package pl.devsmentoring.java.Module5;

import java.util.HashMap;
import java.util.Map;

public class Exercise16 {
    public static void main(String[] args) {


        Map<String, String> fiveNames = new HashMap<>();
        fiveNames.put("Tomek", "96040219445");
        fiveNames.put("Piotr", "97040213445");
        fiveNames.put("Klaudia", "96023215465");
        fiveNames.put("Patryk", "96640514441");
        fiveNames.put("Anna", "96020114454");

        if (fiveNames.containsKey("Anna")) {
            System.out.println("Our map contains name : Anna");
        }
        System.out.println(" ");

        for (Map.Entry<String, String> entry : fiveNames.entrySet()) {
            if (entry.getValue().startsWith("9")) {
                System.out.println("Some value starts with 9.");
                break;
            }
        }

        fiveNames.remove("Tomek");
        fiveNames.remove("Patryk");
        System.out.println(fiveNames);

        if (fiveNames.size() == 3) {
            System.out.println("The map’s size is correct.");
        }

        System.out.println(fiveNames.getOrDefault("Euzebiusz", "No such name!"));

        if (fiveNames.isEmpty()) {
            System.out.println("Nothing to do here!");
        } else {
            System.out.println("Size of the map is: " + fiveNames.size());
        }

    }
}