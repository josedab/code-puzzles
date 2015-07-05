package org.josedab.puzzles.example5;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
        System.out.println(isPrime(6));

    }

    // Is n a prime? N is positive
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        int i = 2;
        while ((i <= (Math.sqrt(n))) && isPrime) {
            if (n % i == 0) {
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }
}
