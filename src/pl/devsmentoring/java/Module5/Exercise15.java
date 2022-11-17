package pl.devsmentoring.java.Module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise15 {
    //    Zad. 15 (T)
//    Napisz program, który utworzy Array Listę i dodaj do niej 8 dowolnych kolorów w formie Stringów.
//
//    Dopisz funkcjonalności:
//    Przeiteruj przez każdy element list
//    Zastąp 5-ty element kolorem: lilac
//    Dodaj na sam początek listy nowy kolor: turquoise
//    Posortuj listę kolorów
//    Utwórz nową listę - reversedColours - która będzie przechowywała te same elementy,
//    co wcześniej utworzona lista, ale będą one przechowywane w odwrotnej kolejności.

    public static void main(String[] args) {

        List<String> newList = new ArrayList<>(Arrays.asList("Blue", "Yellow", "Black", "Green",
                "White", "Red", "Purple", "Pink"));

        // Printing every element using enchanted for
        for (String s : newList) {
            System.out.println("Element: " + s);
        }
        System.out.println(" ");

        // Setting color Liliac on 5-th element
        newList.set(4, "Lilac");
        System.out.println("After setting Lillac: " + newList);
        System.out.println(" ");

        // Adding colour turquoise to index 0
        newList.add(0, "Turquoise");
        System.out.println("After adding turquoise: " + newList);
        System.out.println(" ");

        // Sorting array
        Collections.sort(newList);
        System.out.println("Sorted array list is: " + newList);
        System.out.println(" ");


        // Creating new ArrayList from newList and reversing it
        List<String> reversedColours = new ArrayList<>();
        reversedColours.addAll(newList);
        Collections.reverse(reversedColours);

        System.out.println("Reversed list is: " + reversedColours);
    }
}
