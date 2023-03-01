package pl.devsmentoring.java.Module4.Exercise04;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.assertEquals;


class LoopServiceTest {

    @Test
    public void testPrintNumbers() {
        List<Integer> expectedOutput = IntStream.rangeClosed(50, 100).boxed().collect(Collectors.toList());
        assertEquals(expectedOutput, LoopService.printNumbers(100, 50));
    }

    @Test
    public void testPrintNumbersWhile() {
        List<Integer> expectedOutput = IntStream.rangeClosed(100, 50).boxed().collect(Collectors.toList());
        assertEquals(expectedOutput, LoopService.printNumbersWhile(100, 50));
    }
}