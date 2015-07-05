package org.josedab.puzzles.example4;

public class FizzBuzz {

    public static void main(String[] args) {

        fizzbuzz(100);

    }

    public static void fizzbuzz(int n) {
        if (n < 0) {
            throw new UnsupportedOperationException();
        }

        for (int i = 1; i < n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
