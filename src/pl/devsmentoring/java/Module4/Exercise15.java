package pl.devsmentoring.java.Module4;

import java.util.Scanner;

public class Exercise15 {

    static int odczytajLiczbe() {
        Scanner odczyt = new Scanner(System.in);
        return odczyt.nextInt();
    }

    static boolean sprawdzLiczbeDoskonala(int liczba) {

        int suma = 0;

        for (int i = 1; i < liczba; i++) {
            if (liczba % i == 0)
                suma += i;
        }

        if (suma == liczba) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int liczba;

        System.out.println("Podaj dowolną liczbę.");

        liczba = odczytajLiczbe();

        if (sprawdzLiczbeDoskonala(liczba))
            System.out.println("Podana liczba jest doskonala");

        else
            System.out.println("Podana liczba nie jest doskonala");

    }
}
