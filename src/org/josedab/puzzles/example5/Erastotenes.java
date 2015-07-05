package org.josedab.puzzles.example5;

import java.util.LinkedList;
import java.util.List;

public class Erastotenes {
    public static void main(String[] args) {
        performErastotenesCrib2(100);
    }

    public static void performErastotenesCrib1(int n) {
        for (int i = 2; i <= n; i++) {
            if (Prime.isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Optimized way
    public static void performErastotenesCrib2(int n) {
        List<Integer> primeNumbers = new LinkedList<Integer>();
        for (int i = 2; i <= n; i++) {
            if (!isDivisibleByAnyPrime(i, primeNumbers)) {
                primeNumbers.add(i);
                System.out.println(i);
            }
        }
    }

    private static boolean isDivisibleByAnyPrime(int n, List<Integer> listOfPrimes) {
        boolean isDivisible = false;
        for (int prime : listOfPrimes) {
            if (n % prime == 0) {
                isDivisible = true;
                break;
            }
        }
        return isDivisible;
    }
}
