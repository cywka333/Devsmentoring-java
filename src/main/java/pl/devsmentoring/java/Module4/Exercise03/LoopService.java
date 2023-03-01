package pl.devsmentoring.java.Module4.Exercise03;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LoopService {

    public void printLoop(InputStream in, PrintStream out) {
        Scanner keyboard = new Scanner(in);
        System.out.println("Give me a number which will be the end of loop:");
        int endNum = keyboard.nextInt();
        System.out.println("--FOR LOOP--");
        for (int i = 0; i <= endNum; i++) {
            System.out.println(i);
        }
        System.out.println("--WHILE LOOP--");

        int num = 0;
        while (num <= endNum) {
            System.out.println(num);
            num++;
        }
    }
}
