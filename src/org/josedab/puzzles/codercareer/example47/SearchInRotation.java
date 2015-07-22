package org.josedab.puzzles.codercareer.example47;

public class SearchInRotation {

    public static void main(String[] args) {
        int[] numbers = { 3, 4, 5, 1, 2 };
        System.out.println(findIndexNumber(numbers, 4));
        System.out.println(findIndexNumber2(numbers, 4));

    }

    // O(n)
    public static int findIndexNumber(int[] array, int n) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                result = i;
                break;
            }
        }
        return result;
    }

    // O(log n)
    public static int findIndexNumber2(int[] array, int n) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;
            if (array[middle] == n) {
                return middle;
            }
            if (array[middle] <= array[right]) {
                if (array[middle] <= n && array[right] >= n) {
                    if (array[middle] > n) {
                        right = middle;
                    } else {
                        left = middle;
                    }
                }
                return middle;
            } else {
                if (array[middle] < n && array[right] < n) {
                    left = middle;
                } else {
                    right = middle;
                }
            }
        }

        return -1;
    }

}
