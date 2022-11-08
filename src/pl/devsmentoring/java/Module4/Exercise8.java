package pl.devsmentoring.java.Module4;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int startValue = scanner.nextInt();

        while (startValue > 0) {
            System.out.println("Please enter a new number: ");
            int newNumber = scanner.nextInt();
            int sumNumber = startValue + newNumber;
            if (newNumber <= 0) {
                System.out.println("You entered a negative number or 0. Your sum is: " + sumNumber + ". BYE!");
                break;
            } else {
                startValue = startValue + newNumber;
                if (startValue >= sumNumber) {
                    System.out.println("New sum is: " + sumNumber + ". Please enter new number!");
                }
            }
        }

        //OR

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int startValue2 = scanner.nextInt();

        if (startValue2 >= 0) {
            while (startValue2 >= 0) {
                System.out.println("Please enter a new number: ");
                int newNumber2 = scanner2.nextInt();
                int sumNumber2 = startValue2 + newNumber2;
                if (newNumber2 <= 0) {
                    System.out.println("You entered a negative number or 0. Your sum is: " + sumNumber2 + ". BYE!");
                    break;
                } else {
                    startValue2 = startValue2 + newNumber2;
                    if (startValue >= sumNumber2) {
                        System.out.println("New sum is: " + sumNumber2 + ". Please enter new number!");
                    }
                }
            }
        } else {
            System.out.println("You entered a negative number. Please enter positive number.");
        }
    }
}
