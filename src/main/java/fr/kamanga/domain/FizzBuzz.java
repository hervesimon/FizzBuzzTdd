package fr.kamanga.domain;public class FizzBuzz {
    public String compute(int i) {
        if(i % 3 == 0){
            return "Fizz";
        }

        if( i % 5 == 0){
            return "Buzz";
        }

        return "" + i;
    }
}
