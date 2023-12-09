package com.prof.algorithms;

public class SumElement {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = arrSum(arr, 0);
        System.out.println(sum);
    }

    private static int arrSum(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }
        return arr[i] + arrSum(arr, i + 1);
    }
}

