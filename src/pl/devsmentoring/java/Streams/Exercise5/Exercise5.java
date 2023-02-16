package pl.devsmentoring.java.Streams.Exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {

        List<Integer> basicList = new ArrayList<>(Arrays.asList(1, 10, 15, 20, 30, 40, 50));

        basicList.stream()
                 .map(x -> x*x)
                 .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
