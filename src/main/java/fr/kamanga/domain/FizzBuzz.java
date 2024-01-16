package fr.kamanga.domain;public class FizzBuzz {
    public String compute(int i) {
        if(i % 3 == 0){
            return "Fizz";
        }

        if( 5 == i){
            return "Buzz";
        }

        return "" + i;
    }
}
