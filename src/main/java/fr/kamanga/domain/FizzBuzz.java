package fr.kamanga.domain;public class FizzBuzz {
    public String compute(int i) {
        if( 3 == i){
            return "Fizz";
        }

        if( 5 == i){
            return "Buzz";
        }

        return "" + i;
    }
}
