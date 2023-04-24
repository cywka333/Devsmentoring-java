package pl.devsmentoring.java.Exceptions;

import java.util.Scanner;

class UserInput{
    private Scanner sc = new Scanner(System.in);

    public String getFilePath() {
        System.out.print("Enter file path: ");
        return sc.nextLine();
    }

    public int getNoConnectors() {
        System.out.print("Enter number of connectors: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter an integer.");
            return getNoConnectors();
        }
    }

    public int getMaxFileSize() {
        System.out.print("Enter max file size: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
            return getMaxFileSize();
        }
    }
}