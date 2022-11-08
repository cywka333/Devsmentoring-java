package pl.devsmentoring.java.Module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise11 {

    //Z podanej tablicy:
    //
    //String[][] numbers2D = {{"John", "Jasper"}, {"Casper", "Jonathan"},
    //{"Unknown", "Unknown"}, {"Alice", "Bob"}, {"Stanley", "Unknown"}};
    //
    //
    //Wyświetl tylko te podtablice składowe, które nie mają w sobie wartości “Unknown”.
    // Wykorzystaj metodę .contains().
    public static void main(String[] args) {
        String[][] numbers2D = {{"John", "Jasper"}, {"Casper", "Jonathan"},
                {"Unknown", "Unknown"}, {"Alice", "Bob"}, {"Stanley", "Unknown"}};

        List<String> names = new ArrayList<>(Arrays.stream(numbers2D).flatMap(Arrays::stream).toList());

        for (int i = 0; i < names.size(); i++) {
            if (names.contains("Unknown")) {
                names.remove("Unknown");
            }
        }
        System.out.println(names);
    }
}
