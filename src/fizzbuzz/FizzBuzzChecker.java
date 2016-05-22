package fizzbuzz;

public class FizzBuzzChecker {

    public void checkFizzBuzz(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                System.out.println(i + ": Fizz" + isFizzBuzz(i, 5, "Buzz"));
            } else if (i % 5 == 0) {
                System.out.println(i + ": " + isFizzBuzz(i, 3, "Fizz") + "Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private String isFizzBuzz(int n, int mod, String str) {
        return n % mod == 0 ? str : "";
    }

}
