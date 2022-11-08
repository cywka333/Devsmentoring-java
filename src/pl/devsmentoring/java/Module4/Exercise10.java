package pl.devsmentoring.java.Module4;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        int astronauts;
        int startFuelLevel;

        //1 part
        System.out.println("Please enter a level of fuel. Enter value between 5000 and 30000.");
        Scanner scannerFuelLevelFromKeyboard = new Scanner(System.in);

        do {
            System.out.println("Give me value between 5000 and 30 0000");
            startFuelLevel = scannerFuelLevelFromKeyboard.nextInt();
        } while (startFuelLevel < 5000 || startFuelLevel > 30000);
        System.out.println("Your fuel level is: " + startFuelLevel + ". Prepare to start!");

        // 2 part
        System.out.println("Next step. Please give me the number of astronauts you wold like to have on board. " +
                "You can choose min. 1 and max. 7 astronauts.");
        Scanner scannerAstronautsOnBoard = new Scanner(System.in);
        do {
            astronauts = scannerAstronautsOnBoard.nextInt();
            System.out.println("You entered too less or too much astronauts. Please choose 1-7 astronauts!");

        } while (7 < astronauts || astronauts <= 0);
        System.out.println("You choose: " + astronauts + ". Hope you like them.");
        System.out.println("\n We are preparing to start. You have your crew and fuel ready.\n");


        // 3 part - need changes!!!!!! Fuel level is not updating

        int fuelConsumption = 300 + (100 * astronauts);

        int distance;
        int fuelTrip = startFuelLevel;
        System.out.println("You are consumpting: " + fuelConsumption + " per 100km");


        for (distance = 100; distance <= 2000; distance += 100) {
            System.out.println(" ");
            System.out.println("Distance:" + distance);
            fuelTrip = fuelTrip - fuelConsumption;
            if (fuelTrip <= 0) {
                System.out.println("The ship has not reached the orbit.");
                break;
            }
            if (distance >= 2000) {
                System.out.println("The spaceship reached the orbit");
            }
            System.out.println("Fuel: " + fuelTrip);

        }
    }
}
