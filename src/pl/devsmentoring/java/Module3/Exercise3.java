package pl.devsmentoring.java.Module3;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        System.out.println("Please tell me what is your name: ");
        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();
        System.out.println("Please tell me what is your surname: ");
        Scanner scannerSurname = new Scanner(System.in);
        String surname = scannerSurname.nextLine();
        System.out.println("How old are you?: ");
        Scanner scannerAge = new Scanner(System.in);
        byte age = scannerAge.nextByte();
        System.out.println("What is your height?: ");
        Scanner scannerHeight = new Scanner(System.in);
        float height = scannerHeight.nextFloat();

        System.out.println("Hello " + name + " " + surname + "! Thank you for joining us. \n" +
                "You are " + age + " years old and your height is " + height + " cm. \n");
    }
}
