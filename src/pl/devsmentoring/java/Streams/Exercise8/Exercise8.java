package pl.devsmentoring.java.Streams.Exercise8;

import java.util.Random;
import java.util.stream.Stream;

public class Exercise8 {
    public static void main(String[] args) {

        //Stwórz strumień, który będzie w nieskończoność generował i wyświetlał trzycyfrowe liczby parzyste.

        Random rand = new Random();
        Stream.generate(() -> {
                    int number = rand.nextInt(900) + 100;
                    return number % 2 == 0 ? number : number + 1;
                })
                .forEach(System.out::println);
    }
}


