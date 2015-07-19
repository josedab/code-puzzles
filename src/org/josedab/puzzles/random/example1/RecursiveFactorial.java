package org.josedab.puzzles.random.example1;

public class RecursiveFactorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(0));
        System.out.println(factorial(3));
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new UnsupportedOperationException();
        }

        int result = 1;
        if (n > 0) {
            result = n * factorial(n - 1);
        }

        return result;

    }

}
