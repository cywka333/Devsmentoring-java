package pl.devsmentoring.java.Module4.Exercise04;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LoopService {

    public static List<Integer> printNumbers(int start, int end) {
        for (int i = start; i >= end; i--){
            System.out.println(i + " ");
        }
        return IntStream.rangeClosed(end, start)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> printNumbersWhile(int startNumber, int endNumber) {
        while (startNumber >= endNumber) {
            System.out.print(startNumber + " ");
            startNumber--;
        }
        return IntStream.rangeClosed(endNumber, startNumber)
                .boxed()
                .collect(Collectors.toList());
    }

}