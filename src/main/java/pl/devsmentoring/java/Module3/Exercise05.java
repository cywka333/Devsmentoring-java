package pl.devsmentoring.java.Module3;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Scanner wholeNumberFizzBuzz = new Scanner(System.in);
        System.out.println("Please give me any whole number: ");
        int wholeNumber = wholeNumberFizzBuzz.nextInt();

        if (wholeNumber % 3 == 0 && wholeNumber % 4 == 0) {
            System.out.println("FizzBuzz");
        } else if (wholeNumber % 4 == 0) {
            System.out.println("Buzz");
        } else if (wholeNumber % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("N/A");
        }
    }
}
