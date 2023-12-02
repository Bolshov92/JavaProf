package com.prof.homework.massiv_list;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        changeArray(array);
        printArray(array);
    }

    private static void changeArray(int[] arr) {
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            int temp = arr[head];
            arr[head] = arr[tail];
            arr[tail] = temp;
            head++;
            tail--;
        }
    }

    private static void printArray(int[] arr) {
        for (int change : arr) {
            System.out.print(change + " ");
        }
    }
}
