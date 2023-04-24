package pl.devsmentoring.java.CelciusConverter;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

class ConverterService {
    private double temperature;
    Scanner scanner;

    public double getTemperature() {
        return temperature;
    }

    public ConverterService(double temperature, InputStream inputStream) {
        this.temperature = temperature;
        this.scanner = new Scanner(inputStream);
    }

    public double celsiusToFahrenheitConverter(double temperature) {
        return temperature * 9 / 5 + 32;
    }

    public double fahrenheitToCelsiusConverter(double temperature) {
        return (temperature - 32) * 5 / 9;
    }

    public String conversion() {
        String result = "";
        try {
            System.out.print("Please choose conversion type: \n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n");
            int conversionType = scanner.nextInt();

            if (conversionType == 1) {
                result = ((getTemperature() * 9 / 5) + 32) + " degrees Fahrenheit";
            } else if (conversionType == 2) {
                result = ((getTemperature() - 32) * 5 / 9) + " degrees Celsius";
            } else {
                result = "Invalid conversion type. Please enter 1 or 2.";
            }
        } catch (InputMismatchException e) {
            result = "Invalid input. Please enter 1 or 2.";
        }
        scanner.close();
        return result;
    }
}