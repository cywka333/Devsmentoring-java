package pl.devsmentoring.java.Module4;

import java.util.Random;
import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Random randomNumbers = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number of tries.");


        int numbersOfTries = scanner.nextInt();
        int[] tab = new int[numbersOfTries];
        int positiveNumberCounter = 0;
        int negativeNumberCounter = 0;

        for (int i = 0; i < numbersOfTries; i++) {
            int randomNumbersRange = randomNumbers.nextInt(-100, 100);
            tab[i] = randomNumbersRange;
            System.out.print(tab[i]);
            System.out.print("  ");
        }

        int max = tab[0];
        int min = tab[0];

        for (int j = 0; j < tab.length; j++) {
            if (tab[j] > 0) {
                positiveNumberCounter++;
            } else if (tab[j] < 0) {
                negativeNumberCounter++;
            }
            if (tab[j] > max) {
                max = tab[j];
            }
        }

        for (int k = 0; k < tab.length; k++) {
            if (tab[k] < min) {
                min = tab[k];
            }
        }
        System.out.println(" ");

        System.out.println(positiveNumberCounter / negativeNumberCounter + " " + max + " " + min);
    }
}
