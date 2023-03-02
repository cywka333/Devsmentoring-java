package pl.devsmentoring.java.CelciusConverter;

import java.util.InputMismatchException;
import java.util.Scanner;

class ConverterService {
    private double Degrees;
    private Scanner keyboard = new Scanner(System.in);

    public ConverterService(double degrees) {
        Degrees = degrees;
    }
    private int userChoice;

    public double getDegrees() {
        return Degrees;
    }


    boolean conversion(){
        System.out.println("Please enter 1 if you want to enter temperature in Celsius and convert it to Fahrenheit."
                + "\nPlease enter 2 if you want to enter temperature in Fahrenheit and convert it to Celsius.");
        try {
            this.userChoice = keyboard.nextInt();
            if (userChoice == 1) {
                System.out.println("You are converting Celsius to Fahrenheit");
                celsiusToFahrenheitConverter();
                return true;
            } else if (userChoice == 2) {
                System.out.println("You are converting Fahrenheit to Celsius");
                fahrenheitToCelsiusConverter();
                return true;
            } else {
                throw new IllegalArgumentException("Incorrect value. Please enter 1 or 2.");
            }
        } catch (InputMismatchException e){
            throw new IllegalArgumentException("Incorrect value. Please enter number 1 or 2.");
        }
    }

    private void celsiusToFahrenheitConverter(){
        double fahrenheitResult = (getDegrees() * 9/5) + 32;
        System.out.println("You converted " + getDegrees() + " Celsius."
                           + " The Fahrenheit degrees: " + fahrenheitResult );
        }

    private void fahrenheitToCelsiusConverter(){
        double celsiusResult = (getDegrees() - 32) * 5/9;
        System.out.println("You converted " + getDegrees() + " Fahrenheit."
                + " The Celsius degrees: " + celsiusResult );
    }
}