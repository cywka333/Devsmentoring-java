package pl.devsmentoring.java.Module3;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Zodiac sign: Aquarius, Pisces, Aries, Taurus, " +
                "Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn: ");
        String zodiacSign = scanner.next();

        switch (zodiacSign) {
            case "Aquarius" -> System.out.println("You're born between " + "20 Jan and 18 Feb");
            case "Pisces" -> System.out.println("You're born between " + "19 Feb and 19 Mar");
            case "Aries" -> System.out.println("You're born between " + "21 Mar and 19 Apr");
            case "Taurus" -> System.out.println("You're born between " + "20 Apr and 22 May");
            case "Gemini" -> System.out.println("You're born between " + "23 May and 21 Jun");
            case "Cancer" -> System.out.println("You're born between " + "22 Jun and 22 Jul");
            case "Leo" -> System.out.println("You're born between " + "23 Jul and 22 Aug");
            case "Virgo" -> System.out.println("You're born between " + "24 Aug and 22 Sep");
            case "Libra" -> System.out.println("You're born between " + "23 Sep and 22 May");
            case "Scorpio" -> System.out.println("You're born between " + "23 Oct and 21 Nov");
            case "Sagittarius" -> System.out.println("You're born between " + "22 Nov and 21 Dec");
            case "Capricorn" -> System.out.println("You're born between " + "22 Dec and 19 Jan");
            default -> System.out.println("You entered wrong value!");
        }

    }
}
