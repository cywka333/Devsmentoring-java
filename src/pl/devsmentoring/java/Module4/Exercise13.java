package pl.devsmentoring.java.Module4;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        System.out.println("1. Wyświetl ilość kursantów.");
        System.out.println("2. Wyświetl nazwę firmy.");
        System.out.println("3. Wyświetl rok założenia firmy.");
        System.out.println("4. Wyjdź.");

        Scanner scannerUserChoice = new Scanner(System.in);
        int userNumberChoice = scannerUserChoice.nextInt();

        while (1 > userNumberChoice || userNumberChoice > 4) {
            System.out.println("1. Wyświetl ilość kursantów.");
            System.out.println("2. Wyświetl nazwę firmy.");
            System.out.println("3. Wyświetl rok założenia firmy.");
            System.out.println("4. Wyjdź.");
            userNumberChoice = scannerUserChoice.nextInt();
        }

        while (1 <= userNumberChoice && userNumberChoice <= 4) {
            if (userNumberChoice == 1) {
                System.out.println("70");
            } else if (userNumberChoice == 2) {
                System.out.println("Devs-Mentoring.pl");
            } else if (userNumberChoice == 3) {
                System.out.println("2022");
            } else {
                break;
            }
            System.out.println("1. Wyświetl ilość kursantów.");
            System.out.println("2. Wyświetl nazwę firmy.");
            System.out.println("3. Wyświetl rok założenia firmy.");
            System.out.println("4. Wyjdź.");
            userNumberChoice = scannerUserChoice.nextInt();
        }
    }
}
