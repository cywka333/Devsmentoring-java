package pl.devsmentoring.java.Module4;

import java.util.Scanner;

public class Exercise06 {

    public static void exec_6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the power of the number 2:");
        // Power value,
        int powerValue = scanner.nextInt();
        int n = 2;
        int i = 0;
        System.out.println("You entered power of: " + powerValue);

        while (i <= powerValue) {
            System.out.println("Next power of number 2 is: " + n);
            n = n*2;
            i++;
        }
    }
}
