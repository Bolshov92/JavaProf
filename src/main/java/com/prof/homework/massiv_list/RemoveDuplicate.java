package com.prof.homework.massiv_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,2,5,6,5,7,8};
        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Old One : " + Arrays.toString(array));
        System.out.println("New One: " + Arrays.toString(uniqueArray));

        System.out.println();

        Integer[] arr = {1,1,2,3,4,4,5,6,5,7,8};
        List<Integer> uniqueList = removeDuplicates(arr);

        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Список без дубликатов: " + uniqueList);
    }




    public static int[] removeDuplicates(int[] array) {
        int length = array.length;
        int temp = 0;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[temp++] = array[i];
            }
        }
        array[temp++] = array[length - 1];
        int[] uniqueArray = Arrays.copyOf(array, temp);
        return uniqueArray;
    }

    public static List<Integer> removeDuplicates(Integer[] array) {
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer list : array) {
            if (!uniqueList.contains(list)) {
                uniqueList.add(list);
            }
        }
        return uniqueList;
    }
}
