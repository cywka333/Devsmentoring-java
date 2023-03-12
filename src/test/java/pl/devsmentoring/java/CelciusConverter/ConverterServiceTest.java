package pl.devsmentoring.java.CelciusConverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class ConverterServiceTest {

    private ConverterService converter;

    @BeforeEach
    public void setUp() {
        double temperature = 20;
        InputStream inputStream = new ByteArrayInputStream("1".getBytes());
        converter = new ConverterService(temperature, inputStream);
    }

    @Test
    public void testCelsiusToFahrenheitConverter() {
        double expected = 68.0;
        double actual = converter.celsiusToFahrenheitConverter(20);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testFahrenheitToCelsiusConverter() {
        double expected = 20.0;
        double actual = converter.fahrenheitToCelsiusConverter(68);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testConversionCelsiusToFahrenheit() {
        String expected = "68.0 degrees Fahrenheit";
        String actual = converter.conversion();
        assertEquals(expected, actual);
    }

    @Test
    public void testConversionFahrenheitToCelsius() {
        InputStream inputStream = new ByteArrayInputStream("2".getBytes());
        converter = new ConverterService(68, inputStream);
        String expected = "20.0 degrees Celsius";
        String actual = converter.conversion();
        assertEquals(expected, actual);
    }

    @Test
    public void testConversionInvalidType() {
        InputStream inputStream = new ByteArrayInputStream("3".getBytes());
        converter = new ConverterService(20, inputStream);
        String expected = "Invalid conversion type. Please enter 1 or 2.";
        String actual = converter.conversion();
        assertEquals(expected, actual);
    }

    @Test
    public void testConversionInvalidInput() {
        InputStream inputStream = new ByteArrayInputStream("not a number".getBytes());
        converter = new ConverterService(20, inputStream);
        String expected = "Invalid input. Please enter 1 or 2.";
        String actual = converter.conversion();
        assertEquals(expected, actual);
    }

}