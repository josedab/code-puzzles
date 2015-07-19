package org.josedab.puzzles.random.example11;

public class IndexPosition {

    public static void main(String[] args) {
        System.out.println(getIndexEqualsPosition(new int[] { -3, -1, 1, 3, 5 }));
        System.out.println(getNumberSameAsIndex(new int[] { -3, -1, 1, 1, 1, 1, 1, 1 ,1, 2, 10 }));

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
    
    public static int getNumberSameAsIndex(int[] numbers) {
        if(numbers == null || numbers.length == 0) {
            return -1;
        }
           
        int left = 0;
        int right = numbers.length - 1;
        while(left <= right) {
            int middle = left + ((right - left) >>> 1);
            if(numbers[middle] == middle) {
                return middle;
            }
               
            if(numbers[middle] > middle) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
           
        return -1;
    }
}
