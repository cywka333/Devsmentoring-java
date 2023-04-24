package pl.devsmentoring.java.Module5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scannerInsideDoWhile = new Scanner(System.in);
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


        do {
            System.out.println("Enter 1 if you want to add new album. Enter 2 if you want to delete album.");
            int userChoiceInput = scanner.nextInt();

            if (userChoiceInput == 1) {
                System.out.print("Please enter the name of album: ");
                String userAlbumInput = scannerInsideDoWhile.nextLine();

                System.out.print("Please enter the author of album " + userAlbumInput + ": ");
                String userAuthorInput = scannerInsideDoWhile.nextLine();
                System.out.println("The author of album: " + userAlbumInput + " is: " + userAuthorInput);

                playList.put(userAlbumInput, userAuthorInput);
                System.out.println("Now your playlist looks like this: " + Arrays.asList(playList));
                userStop = false;

            } else if (userChoiceInput == 2) {
                System.out.print("Please enter the album you want to delete: ");
                String userAlbumDeleteInput = scannerInsideDoWhile.nextLine();
                playList.remove(userAlbumDeleteInput);
                System.out.println("YOu deleted: " + userAlbumDeleteInput + "Now playlist looks like this: " + Arrays.asList(playList));
                userStop = false;

            }else {
                System.out.println("You typed value smaller than 1 or above 2. Try again.");
            }
        }while (userStop);
    }
}