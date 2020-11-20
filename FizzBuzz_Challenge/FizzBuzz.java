package FizzBuzz_Challenge;

public class FizzBuzz {

    static String fizzbuzz(int number) {
        // check if number is not divisible by 3 and 5
        if (number % 3 >= 1 && number % 5 >= 1) {
            // local var to output an integer as a string
            String output = "";
            output = Integer.toString(number);
            return output;
        }
        // checking if the number is ONLY divisble by 3
        if (number % 3 == 0 && number % 5 >= 1) {
            return "fizz";
        }
        // checking if the number is ONLY divisble by 5
        if (number % 5 == 0 && number % 3 >= 1) {
            return "buzz";
        }
        // checking if the number is both divisible by 3 and 5
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        }
        return null;
    }

}
