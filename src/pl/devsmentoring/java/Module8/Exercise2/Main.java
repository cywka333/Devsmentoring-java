package pl.devsmentoring.java.Module8.Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me length of the square");
        Square square = new Square(scanner.nextInt());
        Square square1 = new Square(2);

        square.areaDisplay();

        System.out.println("");

        square1.areaDisplay();

        Shape shape = new Shape(3);
        Shape shape1 = new Shape(2);

        shape.areaDisplay();
        shape1.areaDisplay();



    }
}