package pl.devsmentoring.java.Module4.Exercise06;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PowerOfNumber2 {

    int n = 2;
    int i = 0;

    public int printPower(InputStream in, PrintStream out) {
        Scanner keyboard = new Scanner(in);
        System.out.println("Please type the power of the number 2: ");
        int powerNumber = keyboard.nextInt();
        System.out.println("You entered power of: " + powerNumber);

        while (i <= powerNumber){
            System.out.println("Next power of number 2 is: " + n);
            n = n*2;
            i++;
        }
        return powerNumber;
    }
}
