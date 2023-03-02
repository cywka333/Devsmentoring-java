package pl.devsmentoring.java.Module4.Exercise03;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class LoopServiceTest {

    @Test
    void printLoop_shouldPrintLoopsForFive() {
        //given
        String number = "5"; //tutaj definiuję nasz input - np. 5. Definiuję go w formie Stringa, ponieważ String można zmienić na tablicę bajtów co nam się przyda tutaj.
        ByteArrayInputStream in = new ByteArrayInputStream(number.getBytes()); // tutaj przetwarzam ww. input na tzw. input stream.
        System.setIn(in); // w tej linii wrzucam tą tablicę do streamu systemowego

        ByteArrayOutputStream outContent = new ByteArrayOutputStream(); // ten obiekt jest opcjonalny ale dzięki niemu mogę przechwycić output z konsoli dzięki czemu mogę zrobić jakieś asercje.
        PrintStream out = System.out; // tworzenie "streamu" z System.out'a

        System.setOut(new PrintStream(outContent));
        LoopService loopService = new LoopService(); // deklaruję instancję obiektu LoopService
        //when
        loopService.printLoop(in, out);
        //then
        String outputString = outContent.toString(); //wyciągam logi z konsoli, które się pojawiły podczas egzekucji programu.
    }
}