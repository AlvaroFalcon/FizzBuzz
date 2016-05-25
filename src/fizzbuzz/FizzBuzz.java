package fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzzToString(int number, String fizz, String buzz) {
        return number+": " + fizz + buzz + "\n";
    }

    public static String checkFizzBuzz(int max) {
        String fizzBuzzString = "";
        for (int number = 0; number <= max; number++) {
            fizzBuzzString += isFizzBuzz(number);
        }
        return fizzBuzzString;
    }

    private static String isFizzBuzz(int number) {
        return fizzBuzzToString(number,isFizz(number),isBuzz(number));
    }


    private static String isFizz(int number) {
        return isMult(number, 3) ? "Fizz" : "";
    }

    private static String isBuzz(int number) {
        return isMult(number, 5) ? "Buzz" : "";
    }

    private static boolean isMult(int number, int divisor) {
        return number % divisor == 0;
    }
    public static void main(String[] args) {
        System.out.println(checkFizzBuzz(100));
    }

}
