package com.ivan;

/*
 * This class is Shell Sort implementation.
 * @author ivan
 * @version 1.0.0
 */
public class ShellSort {
    public static void shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap >= 1; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i - gap;
                int tmp = arr[i];
                while (j >= 0 && tmp <= arr[j]) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = tmp;
            }
        }
    }
}
