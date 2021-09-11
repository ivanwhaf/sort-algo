package com.ivan;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int left, int right) {
        if (left == right) return;
        int mid = (left + right) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int t = 0;
        int i = left, j = mid + 1;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tmp[t] = arr[i];
                t++;
                i++;
            } else {
                tmp[t] = arr[j];
                t++;
                j++;
            }
        }

        while (i <= mid) {
            tmp[t] = arr[i];
            i++;
            t++;
        }

        while (j <= right) {
            tmp[t] = arr[j];
            j++;
            t++;
        }

        t = 0;
        while (left <= right) {
            arr[left] = tmp[t];
            left++;
            t++;
        }

    }
}
