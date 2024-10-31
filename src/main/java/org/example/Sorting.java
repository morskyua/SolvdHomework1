package org.example;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 8, 4, 1};
        System.out.println("Initial array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
