package fizzbuzz;

public class FizzBuzz {

    public static String checkFizzBuzz(int max) {
        String fizzBuzzString = "";
        for (int number = 0; number <= max; number++) {
            fizzBuzzString = fizzBuzzToString(isFizzBuzz(number),fizzBuzzString);
        }
        return fizzBuzzString;
    }

    private static String isFizzBuzz(int number) {
        if (isFizz(number)) {
            return isBuzz(number) ? number + ": FizzBuzz" : number + ": Fizz";
        } else if (isBuzz(number)) {
            return isFizz(number) ? number + ": FizzBuzz" : number + ": Buzz";
        } else {
            return number + "";
        }

    }

    public static void main(String[] args) {
        System.out.println(checkFizzBuzz(100));
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static String fizzBuzzToString(String fizzBuzz, String fizzBuzzString) {
        return fizzBuzzString + fizzBuzz + "\n";
    }

}
