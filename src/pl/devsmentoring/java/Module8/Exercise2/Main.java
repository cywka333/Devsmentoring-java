package pl.devsmentoring.java.Module8.Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me length of the square");
        Square square = new Square(scanner.nextInt());

        square.countingArea();
    }
}