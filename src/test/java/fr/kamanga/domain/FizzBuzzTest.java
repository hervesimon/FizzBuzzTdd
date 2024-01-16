package fr.kamanga.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldReturnOneWhenInputIsOne(){
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.compute(1);
        // Then
        assertEquals("1", result);

    }

    @Test
    public void shouldReturnTwoWhenInputIsTwo(){
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.compute(2);
        // Then
        assertEquals("2", result);

    }

    @Test
    public void shouldReturnFizzWhenInputIsThree(){
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.compute(3);
        // Then
        assertEquals("Fizz", result);

    }

    @Test
    public void shouldReturnFourWhenInputIsFour(){
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.compute(4);
        // Then
        assertEquals("4", result);

    }

    @Test
    public void shouldReturnBuzzWhenInputIsFive(){
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.compute(5);
        // Then
        assertEquals("Buzz", result);

    }

    @Test
    public void shouldReturnBuzzWhenInputIsSix(){
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.compute(6);
        // Then
        assertEquals("Fizz", result);

    }

    @Test
    public void shouldReturnSevenWhenInputIsSeven(){
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.compute(7);
        // Then
        assertEquals("7", result);

    }
    @Test
    public void shouldReturnBuzzWhenInputIsTen(){
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.compute(10);
        // Then
        assertEquals("Buzz", result);

    }

    @Test
    public void shouldReturnFizzBuzzWhenInputIsFifteen(){
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.compute(15);
        // Then
        assertEquals("FizzBuzz", result);

    }

}