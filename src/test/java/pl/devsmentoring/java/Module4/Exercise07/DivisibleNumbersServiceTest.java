package pl.devsmentoring.java.Module4.Exercise07;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisibleNumbersServiceTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private DivisibleNumbersService divisibleNumbersService;

    @BeforeEach
    void setUp() {
        divisibleNumbersService = new DivisibleNumbersService();
    }

    @Test
    void testPrintLoopFrom50To100() {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(outContent));
        divisibleNumbersService.printLoopFrom50To100(System.in, System.out);
        assertEquals("Enter a number that will divide numbers from 50 to 100:\n" +
                "50\n" +
                "55\n" +
                "60\n" +
                "65\n" +
                "70\n" +
                "75\n" +
                "80\n" +
                "85\n" +
                "90\n" +
                "95\n" +
                "100\n", outContent.toString());
    }

    @Test
    void testPrintLoopUserRangeChoice() {
        String input = "2\n1\n10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(outContent));
        divisibleNumbersService.printLoopUserRangeChoice(System.in, System.out);
        assertEquals("Enter a number which will be the beginning of range\n" +
                "\nEnter a number which will be the end of range\n" +
                "Enter a number that will divide numbers in range: \n" +
                "The beginning of range is: 1 . The end of range is: 10. The divider is: 2\n" +
                "2\n" +
                "4\n" +
                "6\n" +
                "8\n" +
                "10\n", outContent.toString());
    }
}