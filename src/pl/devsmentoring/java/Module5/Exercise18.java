package pl.devsmentoring.java.Module5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise18 {

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

//        // I check if condition userChoice is true. If it is true, program prints name of album + author (key). If not
//        // it asks for another try.
        for (int i = 0; i <= i; i++) {
            String userChoice = scanner.nextLine();
            if (playList.containsKey(userChoice)) {
                System.out.println("Author of album: " + userChoice + " is: " + playList.get(userChoice));
                break;
            } else if (!playList.containsKey(userChoice)) {
                System.out.println("No data");
                System.out.println("Please enter a name of album. I will try to tell you who the author is.");
            }
        }


        System.out.println("Enter 1 if you want to add new album. Enter 2 if you want to delete album.");
        Scanner scanner2 = new Scanner(System.in);
        String userAlbum = scanner2.nextLine();

        if (userAlbum.startsWith("1")) {
            System.out.println("Please enter the name of album.");
            Scanner userAlbumDetected = new Scanner(System.in);
            String userAlbumDetect = userAlbumDetected.nextLine();

            System.out.println("Please enter the author of album: " + userAlbumDetect);
            Scanner userAuthorDetected = new Scanner(System.in);
            String userAuthorDetect = userAuthorDetected.nextLine();
            System.out.println("The author of album: " + userAlbumDetect + " is: " + userAuthorDetect);

            playList.put(userAlbumDetect, userAuthorDetect);
            System.out.println("Now your playlist looks like this: " + Arrays.asList(playList));

        } else if (userAlbum.startsWith("2")) {
            System.out.println("Please enter the album you want to delete:");
            Scanner userDeleting = new Scanner(System.in);
            String userDelete = userDeleting.nextLine();
            playList.remove(userDelete);
            System.out.println("YOu deleted: " + userDelete + "Now playlist looks like this: " + Arrays.asList(playList));

        }
    }
}