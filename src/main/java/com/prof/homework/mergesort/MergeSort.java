package com.prof.homework.mergesort;

import java.sql.SQLOutput;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {12, 15, 4, 6, 20, 8};
        System.out.println("Original Array : ");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        mergeSort(arr);

        System.out.println("Sort Array : ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // base
        }
        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }

        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
