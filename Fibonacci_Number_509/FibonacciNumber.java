package Fibonacci_Number_509;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 5; // sample input
        int result = fib(n);
        System.out.println("Fibonacci of " + n + " = " + result);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
