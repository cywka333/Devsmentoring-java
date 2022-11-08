package pl.devsmentoring.java.Module4;

import java.util.Scanner;

public class Exercise3 {
    public static void exec_3()
    { // Pętla for
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give max number (y): ");
        int y = scanner.nextInt();
        for (int i = 0; i <= y; i++) {
            System.out.println(i);
        }

        System.out.println("While loop");
        int i = 0;
        while (i <= y) {
            System.out.println(i);
            i++;
        }
    }
}
