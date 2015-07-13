package org.josedab.puzzles.example11;

public class IndexPosition {

    public static void main(String[] args) {
        System.out.println(getIndexEqualsPosition(new int[] { -3, -1, 1, 3, 5 }));

    }

    // O(n)
    public static int getIndexEqualsPosition(int[] array) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (i == array[i]) {
                result = i;
                break;
            }
        }
        return result;
    }
}
