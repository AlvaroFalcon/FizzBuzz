package fizzbuzz;

public class FizzBuzz {

    public static void checkFizzBuzz(int n) {
        for (int i = 0; i <= n; i++) {
            isFizzBuzz(i);
        }
    }

    private static void isFizzBuzz(int i) {
        if (i % 3 == 0) {
            System.out.println(i % 5 == 0 ? i + ": FizzBuzz" : i + ": Fizz");
        } else if (i % 5 == 0) {
            System.out.println(i % 3 == 0 ? i + ": FizzBuzz" : i + ": Buzz");
        } else {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        checkFizzBuzz(100);
    }

}
