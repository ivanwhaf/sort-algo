package com.ivan;

/*
 * This class is Insertion Sort implementation.
 * @author ivan
 * @version 1.0.0
 */
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                //Find insert position and insert
                int tmp = arr[i];
                int j = i - 1;
                while (j >= 0 && tmp <= arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = tmp;
            }
        }
    }
}
