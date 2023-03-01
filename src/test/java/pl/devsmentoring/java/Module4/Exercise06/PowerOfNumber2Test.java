package pl.devsmentoring.java.Module4.Exercise06;

import org.junit.jupiter.api.Test;
import pl.devsmentoring.java.Module4.Exercise03.LoopService;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfNumber2Test {

    @Test
    void printPowerOfNumber2(){
        //given
        String number = "6";
        ByteArrayInputStream in = new ByteArrayInputStream(number.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream out = System.out;

        System.setOut(new PrintStream(outContent));
        PowerOfNumber2 powerOfNumber2 = new PowerOfNumber2();

        //when
        powerOfNumber2.printPower(in, out);

        //then
        String outputString = outContent.toString();
    }

}