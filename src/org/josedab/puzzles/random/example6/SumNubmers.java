package org.josedab.puzzles.random.example6;

public class SumNubmers {
    public static void main(String[] args) {
        System.out.println(sum(5, 3));
        System.out.println(sum(5, -3));
        System.out.println(sum(-5, -3));
        System.out.println(sum(-5, 3));
        System.out.println(sum(-5, 0));
    }

    public static int sum(int a, int b) {
        int result = a;
        while (b != 0) {
            if (b > 0) {
                b--;
                result++;
            } else {
                b++;
                result--;
            }
        }
        return result;
    }
}
