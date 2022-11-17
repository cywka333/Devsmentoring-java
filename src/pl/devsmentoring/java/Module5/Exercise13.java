package pl.devsmentoring.java.Module5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise13 {

    // Zad. 13 (T)
// Napisz program, który będzie pobierał od użytkownika dowolne wyrazy,
// dopóki nie wprowadzi on słowa “STOP”. Po podaniu każdego ze słów, ma
// być ono umieszczane w obiekcie typu ArrayList. Po tak przeprowadzonym
// procesie umieszczania kolejnych elementów, program ma wyświetlać długość
// utworzonej list wraz z informacją, jaki jest jej pierwszy, ostatni i środkowy element.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> newList = new ArrayList<>();

        do {
            System.out.println("Please enter any word: ");
            newList.add(scanner.nextLine());

        } while (!newList.contains("STOP"));

        System.out.println("Size of newList is: " + newList.size());
        System.out.println("First element of newList is: " + newList.get(0));
        System.out.println("Last element is: " + newList.get(newList.size() - 1));
        System.out.println("Middle element is: " + newList.get((newList.size() / 2) - 1));
    }
}