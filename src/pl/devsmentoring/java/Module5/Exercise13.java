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

        System.out.println("Please enter any word: ");
        Scanner userWord = new Scanner(System.in);

        List<String> newList = new ArrayList<>();
        newList.add(userWord.nextLine());

        for (int i = 0; i < newList.size(); i++) {
            if (newList.contains("STOP")) {
                System.out.println("Size of newList is: " + newList.size());
                System.out.println("First element of newList is: " + newList.get(0));
                System.out.println("Last element is: " + newList.get(i));
                System.out.println("Middle element is: " + newList.get(i / 2));
            } else {
                System.out.println("Please enter new word: " + "\n If you want to stop, enter: STOP");
                newList.add(userWord.nextLine());
            }
        }
    }
}
