package pl.devsmentoring.java.Module5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean userStop = false;

        Map<String, String> playList = new HashMap<>();
        playList.put("The Sensual World", "Kate Bush");
        playList.put("Shaday", "Ofra Haze");
        playList.put("Achtung Baby", "U2");
        playList.put("Aion", "Dead Can Dance");
        playList.put("Invisible Touch", "Genesis");

        for (String key : playList.keySet()) {
            System.out.println(key);
        }

        for (HashMap.Entry<String, String> authorChecker : playList.entrySet()){
            do {
                System.out.println("Please give me the name of album. I will tell you who is the author.");
                String userInput = scanner.nextLine();
                if (playList.containsKey(userInput)){
                    System.out.println("Author of album: " + userInput + " is: " + playList.get(userInput));
                    userStop = true;
                }else {
                    System.out.println("You typed wrong name of album. Please try again.");
                }
            }while(!userStop);
            break;
        }
    }
}