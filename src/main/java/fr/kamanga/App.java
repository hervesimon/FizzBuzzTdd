package fr.kamanga;

import java.util.stream.IntStream;

import fr.kamanga.domain.FizzBuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IntStream.rangeClosed(1, 100)
            .mapToObj(i -> new FizzBuzz().compute(i))
            .forEach(System.out::println);
    }
}
