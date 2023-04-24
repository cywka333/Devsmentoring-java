package pl.devsmentoring.java.Module4.Exercise07;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.IntStream;


public class DivisibleNumbersService {

    public void printLoopFrom50To100(InputStream in, OutputStream out){
        Scanner keyboard = new Scanner(in);
        PrintStream printStream = new PrintStream(out);
        printStream.println("Enter a number that will divide numbers from 50 to 100:");
        int divider = keyboard.nextInt();

        IntStream.rangeClosed(50, 100)
                .filter(x -> x%divider == 0)
                .forEach(System.out::println);
    }

    public void printLoopUserRangeChoice(InputStream in, OutputStream out){
        Scanner keyboard = new Scanner(in);
        PrintStream printStream = new PrintStream(out);
        printStream.println("Enter a number which will be the beginning of range");
        int rangeBeginning = keyboard.nextInt();
        printStream.println("\nEnter a number which will be the end of range");
        int rangeEnd = keyboard.nextInt();
        printStream.println("Enter a number that will divide numbers in range: ");
        int divider = keyboard.nextInt();
        printStream.println("The beginning of range is: " + rangeBeginning + " . The end of range is: " + rangeEnd
                            + ". The divider is: " + divider);

        IntStream.rangeClosed(rangeBeginning, rangeEnd)
                                .filter(x -> x%divider == 0)
                                .forEach(System.out::println);
    }
}

