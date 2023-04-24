package pl.devsmentoring.java.Module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise11 {

    public static void main(String[] args) {
        String[][] numbers2D = {{"John", "Jasper"}, {"Casper", "Jonathan"},
                {"Unknown", "Unknown"}, {"Alice", "Bob"}, {"Stanley", "Unknown"}};

        List<String> names = new ArrayList<>(Arrays.stream(numbers2D).flatMap(Arrays::stream).toList());

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase("Unknown")) {
                continue;
            }
            System.out.println(names.get(i));
        }
    }
}