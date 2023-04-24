package pl.devsmentoring.java.StringReverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseServiceTest {

    @Test
    void reverseAndPrintInputString(){
        //given
        String input = "Jakub is so cool";
        //when
        ReverseService service = new ReverseService(input);
        service.reverseAndPrint();
        //then
        assertEquals("looc os si bukaJ", service.getReversedString());
    }

}