package pl.devsmentoring.java.Module3;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner scannerWholeNumber = new Scanner(System.in);
        System.out.println("Please write down a whole number: ");
        int wholeNumber = scannerWholeNumber.nextInt();
        System.out.println(wholeNumber % 2 == 0 ? "Number is positive!" : "Number is negative!");
    }
}
