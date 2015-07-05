package org.josedab.puzzles.example1;

public class IterativeFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(otherFactorial(5));

        System.out.println(factorial(0));
        System.out.println(otherFactorial(0));
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new UnsupportedOperationException();
        }
        int result = 1;
        int i = n;
        while (i > 0) {
            result = i * result;
            i--;
        }
        return result;
    }

    public static int otherFactorial(int n) {
        if (n < 0) {
            throw new UnsupportedOperationException();
        }
        int result = 1;
        while (n > 0) {
            result = n * result;
            n--;
        }
        return result;
    }
}
