package org.josedab.puzzles.random.example8;

public class ProductArray {

    public static void main(String[] args) {
        int[] array = { 1, 7, 3, 4 };
        printArray(multiplyArray(array));
        printArray(multiplyArray2(array));
        printArray(multiplyArray3(array));
        printArray(multiplyArray4(array));
    }

    // O(n^2)
    public static int[] multiplyArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (j != i) {
                    result[i] *= array[j];
                }
            }
        }
        return result;
    }

    // O(n) in computation , O(n) in space
    public static int[] multiplyArray2(int[] array) {
        int[] result = new int[array.length];
        int[] partialProductsBeforeIndex = new int[array.length];
        int[] partialProductsAfterIndex = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            partialProductsBeforeIndex[i] = 1;
            partialProductsAfterIndex[i] = 1;
        }
        int productResult = 1;
        for (int i = 1; i < array.length; i++) {
            productResult = array[i - 1] * partialProductsBeforeIndex[i - 1];
            partialProductsBeforeIndex[i] = productResult;
        }
        productResult = 1;
        for (int i = (array.length - 1); i > 0; i--) {
            productResult = array[i] * partialProductsAfterIndex[i];
            partialProductsAfterIndex[i - 1] = productResult;
        }
        for (int i = 0; i < array.length; i++) {
            result[i] = partialProductsBeforeIndex[i] * partialProductsAfterIndex[i];
        }
        return result;
    }

    // O(n) in computation , O(n) in space. Optimisation v2
    public static int[] multiplyArray3(int[] array) {
        int[] result = new int[array.length];
        int[] partialProductsBeforeIndex = new int[array.length];
        int[] partialProductsAfterIndex = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            partialProductsBeforeIndex[i] = 1;
            partialProductsAfterIndex[i] = 1;
        }
        for (int i = 1; i < array.length; i++) {
            partialProductsBeforeIndex[i] = array[i - 1] * partialProductsBeforeIndex[i - 1];
            partialProductsAfterIndex[array.length - i - 1] = array[array.length - i] * partialProductsAfterIndex[array.length - i];
        }
        for (int i = 0; i < array.length; i++) {
            result[i] = partialProductsBeforeIndex[i] * partialProductsAfterIndex[i];
        }
        return result;
    }

    // O(n) in computation , O(n) in space. Optimisation v3
    public static int[] multiplyArray4(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = 1;
        }
        
        // Forward accumulation
        for (int i = 1; i < array.length; i++) {
            result[i] = array[i - 1] * result[i - 1];
            
        }
        
        // Backwards product accumulation
        int accumulativeProduct = 1;
        for (int i = 1; i < array.length; i++) {
            accumulativeProduct *= array[array.length - i];
            result[array.length - i - 1] *= accumulativeProduct;
        }
        return result;
    }

    public static void printArray(int[] array) {
        String cad = "";
        for (int elem : array) {
            cad += elem + ",";
        }
        System.out.println(cad);

    }
}
