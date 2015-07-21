package org.josedab.puzzles.codercareer.example22;

public class FindTurningNumber {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 10, 9, 8, 7, 6 };
        System.out.println(findTurningNumber(numbers));
        System.out.println(findTurningNumber2(numbers));

    }

    // O(n)
    public static int findTurningNumber(int[] array) {
        int i = -1;
        if (array.length > 0) {
            int pastNumber = array[0];
            for (int elem : array) {
                if (elem < pastNumber) {
                    break;
                } else {
                    pastNumber = elem;
                    i++;
                }
            }
        }
        return i;
    }

    // O(log n)
    public static int findTurningNumber2(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (array[middle] > array[middle + 1] && array[middle] > array[middle - 1]) {
                return middle;
            }
            if (array[middle] <= array[middle + 1]) {
                left = middle;
            } else {
                right = middle;
            }
        }

        return -1;
    }

}
