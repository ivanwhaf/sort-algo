package com.ivan;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] rawArr = generateRandomArray();
        int[] arr;
        long start, end;

        //Bubble Sort
        arr = rawArr.clone();
        start = System.currentTimeMillis();
        BubbleSort.bubbleSort(arr);
        end = System.currentTimeMillis();
        System.out.println("\nArray after bubble sort:");
        //showArray(arr);
        System.out.println("Time:" + String.valueOf(end - start) + "ms");

        //Selection Sort
        arr = rawArr.clone();
        start = System.currentTimeMillis();
        SelectionSort.selectionSort(arr);
        end = System.currentTimeMillis();
        System.out.println("\nArray after selection sort:");
        //showArray(arr);
        System.out.println("Time:" + String.valueOf(end - start) + "ms");

        //Insertion Sort
        arr = rawArr.clone();
        start = System.currentTimeMillis();
        InsertionSort.insertionSort(arr);
        end = System.currentTimeMillis();
        System.out.println("\nArray after insertion sort:");
        //showArray(arr);
        System.out.println("Time:" + String.valueOf(end - start) + "ms");

        //Shell Sort
        arr = rawArr.clone();
        start = System.currentTimeMillis();
        ShellSort.shellSort(arr);
        end = System.currentTimeMillis();
        System.out.println("\nArray after shell sort:");
        //showArray(arr);
        System.out.println("Time:" + String.valueOf(end - start) + "ms");

        //Merge Sort
        arr = rawArr.clone();
        start = System.currentTimeMillis();
        MergeSort.mergeSort(arr);
        end = System.currentTimeMillis();
        System.out.println("\nArray after merge sort:");
        //showArray(arr);
        System.out.println("Time:" + String.valueOf(end - start) + "ms");

        //Quick Sort
        arr = rawArr.clone();
        start = System.currentTimeMillis();
        QuickSort.quickSort(arr, 0, arr.length-1);
        end = System.currentTimeMillis();
        System.out.println("\nArray after quick sort:");
        //showArray(arr);
        System.out.println("Time:" + String.valueOf(end - start) + "ms");
    }

    public static int[] generateRandomArray() {
        int[] arr = new int[3000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        //shuffle array
        Random r = new Random();
        for (int i = 0; i < arr.length / 2; i++) {
            int j = r.nextInt(arr.length);
            int tmp = arr[0];
            arr[0] = arr[j];
            arr[j] = tmp;
        }
        System.out.println("Array before sort:");
        showArray(arr);
        return arr;
    }

    public static void showArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println();
    }
}
