package fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(int max) {
        String fizzBuzzString = "";
        for (int number = 0; number <= max; number++) {
            fizzBuzzString += checkFizzBuzz(number);
        }
        return fizzBuzzString;
    }

    private static String checkFizzBuzz(int number) {
        return fizzBuzzToString(number, getFizz(number), getBuzz(number));
    }

    private static String getFizz(int number) {
        if(isMult(number, 3)) return "Fizz";
        return "";
    }

    private static String getBuzz(int number) {
        if(isMult(number,5)) return "Buzz";
        return "";
    }

    private static boolean isMult(int number, int divisor) {
        return number % divisor == 0;
    }

    public static String fizzBuzzToString(int number, String fizz, String buzz) {
        return number + ": " + fizz + buzz + "\n";
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(100));
    }

}
