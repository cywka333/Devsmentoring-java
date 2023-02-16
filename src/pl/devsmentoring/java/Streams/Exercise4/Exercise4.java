package pl.devsmentoring.java.Streams.Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList<>();
        Random generator = new Random();
        for(int i=0; i<30; i++) {
            randomNumbers.add(generator.nextInt(50));

        }

        for (Integer number: randomNumbers) {
            System.out.println(number);
        }

        System.out.println("\n Positive numbers!");
        randomNumbers.stream()
                     .filter(positiveNumber -> positiveNumber % 2 == 0)
                     .filter(positiveNumber -> positiveNumber > 0)
                     .forEach(System.out::println);


        System.out.println("\nNegative numbers!");
        randomNumbers.stream()
                     .filter(negativeNumber -> negativeNumber%2!=0)
                     .forEach(System.out::println);

    }
}
