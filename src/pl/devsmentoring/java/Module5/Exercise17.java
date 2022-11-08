package pl.devsmentoring.java.Module5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {

        Map<String, String> playList = new HashMap<>();
        playList.put("The Sensual World", "Kate Bush");
        playList.put("Shaday", "Ofra Haze");
        playList.put("Achtung Baby", "U2");
        playList.put("Aion", "Dead Can Dance");
        playList.put("Invisible Touch", "Genesis");

        // Printing all names of albums (keys) on console.
        for (String key : playList.keySet()) {
            System.out.println(key);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name of album. I will try to tell you who the author is.");

        // I check if condition userChoice is true. If it is true, program prints name of album + author (key). If not
        // it asks for another try.
        for (int i = 0; i <= i + 1; i++) {
            String userChoice = scanner.nextLine();
            if (playList.containsKey(userChoice)) {
                System.out.println("Author of album: " + userChoice + " is: " + playList.get(userChoice));
            }else if (!playList.containsKey(userChoice)){
                System.out.println("No data");
                System.out.println("Please enter a name of album. I will try to tell you who the author is.");
            }
        }
    }
}
