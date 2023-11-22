package com.telran.org.lessonfive;

import java.util.Arrays;

public class AppArray {
    public static void main(String[] args) {

        int [][] arr = {{1,2,3},{2,3,4},{5,6,7}};
        printArray(arr);
        int[] inner = arr[1];
        inner[2] = 15;
        printArray(arr);
        int[] arrUnsort = {1,2,3,4,5,6,7};
        Arrays.sort(arrUnsort);
        System.out.println(Arrays.toString(arrUnsort));
    }
    private static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr[i].length; i++){
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
}
