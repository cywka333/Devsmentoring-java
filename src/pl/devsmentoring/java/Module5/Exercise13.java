package pl.devsmentoring.java.Module5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        boolean userStop = false;

        do {
            System.out.println("Type a word you want to add to the list. If you want to show the list type 'STOP'.");
            String userInput = scanner.next();
            if (userInput.equals("STOP")) {
                userStop = true;
                if(arrayList.size()<= 0)
                {
                    System.out.println("List is empty.");
                }else {
                    System.out.println(arrayList);
                    System.out.println("Size of an array is: " + arrayList.size());
                    System.out.println("First element of an array is: " + arrayList.get(0));
                    System.out.println("Last element of an array is: " + arrayList.get(arrayList.size() - 1));
                    System.out.println("Middle element of an array is: " + arrayList.get((arrayList.size() / 2)));
                }
            } else {
                arrayList.add(userInput);
            }
        } while (!userStop);
    }
}