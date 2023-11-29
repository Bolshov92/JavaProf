package com.prof.homework.search;

public class ThirdLargest {

    public static void main(String[] args) {
        int[] arr = {20, 12, 7, 9, 8, 5, 15};
        findThirdMin(arr);
    }
    public static int findThirdMin(int[] array) {

        int firstMin = Math.min(array[0], array.length);
        int secondMin = Math.max(array[0], array.length);
        int thirdMin = Math.max(array[0], array.length);

        for (int search : array) {
            if (search < firstMin) {
                secondMin = firstMin;
                firstMin = search;
            } else if (search < secondMin && search != firstMin) {
                thirdMin = secondMin;
                secondMin = search;
            } else if (search < thirdMin && search != firstMin) {
                thirdMin = search;
            }
        }
        System.out.println(" Third largest :  " + thirdMin);
        return thirdMin;
    }
}



