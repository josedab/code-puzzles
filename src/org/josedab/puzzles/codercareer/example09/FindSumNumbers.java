package org.josedab.puzzles.codercareer.example09;

public class FindSumNumbers {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 4, 7, 11, 15 };
        System.out.println(getCadArray(findNumbersToSum(numbers, 15)));
        System.out.println(getCadArray(findNumbersToSum2(numbers, 15)));
        System.out.println(getCadArray(findNumbersToSum3(numbers, 15)));

    }

    // O(n2)
    public static int[] findNumbersToSum(int[] array, int sum) {
        int[] result = { -1, -1 };
        for (int i = 0; i < array.length; i++) {
            int firstNumber = array[i];
            for (int j = i; j < array.length; j++) {
                int secondNumber = array[j];
                int sumNum = firstNumber + secondNumber;
                if (sumNum == sum) {
                    result[0] = firstNumber;
                    result[1] = secondNumber;
                    return result;
                } else if (sumNum > sum) {
                    break;
                }
            }
        }
        return result;
    }

    // O(n2) optimized to maximize sums to the sum number
    public static int[] findNumbersToSum2(int[] array, int sum) {
        int[] result = { -1, -1 };
        for (int i = array.length - 1; i > 0; i--) {
            int firstNumber = array[i];
            for (int j = i - 1; j > 0; j--) {
                int secondNumber = array[j];
                int sumNum = firstNumber + secondNumber;
                if (sumNum == sum) {
                    result[0] = firstNumber;
                    result[1] = secondNumber;
                    return result;
                } else if (sumNum < sum) {
                    break;
                }
            }
        }
        return result;
    }

    // O(n) on each iteration we get rid of an unsuccessful candidate
    public static int[] findNumbersToSum3(int[] array, int sum) {
        int[] result = { -1, -1 };
        int minIndex = 0;
        int maxIndex = array.length - 1;

        while (maxIndex > minIndex) {

            int sumNum = array[minIndex] + array[maxIndex];
            if (sumNum == sum) {
                result[0] = array[minIndex];
                result[1] = array[maxIndex];
                break;
            } else if (sumNum > sum) {
                maxIndex--;
            } else {
                minIndex++;
            }

        }

        return result;
    }

    public static String getCadArray(int[] array) {
        String result = "";
        for (int elem : array) {
            result += elem + ",";
        }
        return result;
    }

}
