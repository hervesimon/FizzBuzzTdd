package fr.eudemia;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for App class.
 * This test class focuses on the static main method.
 */
public class AppTest {

    // Store the original standard out before changing it
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    /**
     * The test is for the main method of App class.
     * It checks if the main method can correctly utilize the FizzBuzz display method to output
     * the correct FizzBuzz sequence from 1 to 100 to the console.
     */
    @Test
    public void testMain() {
        // Arrange
        System.setOut(new PrintStream(outputStreamCaptor));

        // Act
        App.main(new String[]{});

        // Assert
        String[] output = outputStreamCaptor.toString().split("/n");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                assertEquals("FizzBuzz", output[i - 1].trim());
            } else if (i % 3 == 0) {
                assertEquals("Fizz", output[i - 1].trim());
            } else if (i % 5 == 0) {
                assertEquals("Buzz", output[i - 1].trim());
            } else {
                assertEquals(String.valueOf(i), output[i - 1].trim());
            }
        }

        // Reset the standard out to enable the console to display further messages
        System.setOut(standardOut);
    }
}