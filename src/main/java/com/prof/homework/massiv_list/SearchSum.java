package com.prof.homework.massiv_list;

import java.util.ArrayList;
import java.util.List;

public class SearchSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 8, 9, 10};
        sumArr(arr);
        System.out.println();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        searchSum((ArrayList<Integer>) list);

    }

    public static void sumArr(int[] array) {
        int x = 15;
        int head = 0;
        int tail = array.length - 1;

        while (head < tail) {
            int sum = array[head] + array[tail];

            if (sum == x) {
                System.out.println("Pair found: " + array[head] + " and " + array[tail]);
               return;
            } else if (sum < x) {
                head++;
            } else {
                tail--;
            }
        }

        System.out.println("Pair not found");
    }

    public static void searchSum(ArrayList<Integer> list){
        int x = 9;
        int head = 0;
        int tail = list.size() - 1;

        while (head < tail) {
            int sum = list.get(head) + list.get(tail);

            if (sum == x) {
                System.out.println("Pair found: " + list.get(head) + " and " + list.get(tail));
                return;
            } else if (sum < x) {
                head++;
            } else {
                tail--;
            }
        }
        System.out.println("Not found");
    }
}



