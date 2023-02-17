package pl.devsmentoring.java.Streams.Exercise9;

import java.util.HashMap;
import java.util.Map;

public class Exercise9 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("John", 30);
        students.put("Ann", 20);
        students.put("Casper", 10);
        students.put("Jamie", 20);

        long count = students.entrySet().stream()
                .filter(entry -> entry.getValue() > 20 && entry.getKey().length() > 3)
                .peek(System.out::println)
                .count();

        System.out.println("Numbers of records: " + count);
    }
}