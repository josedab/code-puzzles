package org.josedab.puzzles.example9;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));

        System.out.println(fibonacciIterative(3));
        System.out.println(fibonacciIterative(4));
        System.out.println(fibonacciIterative(5));
        System.out.println(fibonacciIterative(6));

    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static int fibonacciIterative(int n) {
        int f1 = 1;
        int f2 = 1;
        int result = 1;
        for (int i = n - 2; i > 0; i--) {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;

    }

}
