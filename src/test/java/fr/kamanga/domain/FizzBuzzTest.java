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


  
}