package org.josedab.puzzles.random.example10;

public class ProductInts {

    public static void main(String[] args) {
        System.out.println(productInt(new int[] { 1, 2, 3, 4 }));

    }

    // Really heavy O(n^3)
    // Better method keeping two biggest product, two lowest product, highest and lowest
    public static int productInt(int[] array) {
        int highestProduct = 0;

        int partialProduct = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    partialProduct = array[i] * array[j] * array[k];
                    if (partialProduct > highestProduct) {
                        highestProduct = partialProduct;
                    }
                }
            }
        }

        return highestProduct;

    }

}
