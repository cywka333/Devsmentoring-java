package pl.devsmentoring.java.Module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise15 {
    public static void main(String[] args) {

        List<String> newList = new ArrayList<>(Arrays.asList("Blue", "Yellow", "Black", "Green",
                "White", "Red", "Purple", "Pink"));

        for (String s : newList) {
            System.out.println("Element: " + s);
        }
        System.out.println(" ");

        newList.set(4, "Lilac");
        System.out.println("After setting Lillac: " + newList);
        System.out.println(" ");

        newList.add(0, "Turquoise");
        System.out.println("After adding turquoise: " + newList);
        System.out.println(" ");

        Collections.sort(newList);
        System.out.println("Sorted array list is: " + newList);
        System.out.println(" ");

        List<String> reversedColours = new ArrayList<>();
        reversedColours.addAll(newList);
        Collections.reverse(reversedColours);

        System.out.println("Reversed list is: " + reversedColours);
    }
}