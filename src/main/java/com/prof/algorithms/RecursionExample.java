package com.prof.algorithms;

public class RecursionExample {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = power(base, exponent);
        System.out.println(base + " to the power : " + exponent + " equal : " + result);
        System.out.println();

        int[] arr = {1, 3, 5, 6, 8};
        int sum = sumNumber(arr, arr.length - 1);
        System.out.println("Sum elements of massive : " + sum);
        System.out.println();
        int n ;
        int number = factorial(5);
        System.out.println("Factorial numbers : " + number );
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) { //base
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static int sumNumber(int[] array, int index) {
        if (index < 0) { // base
            return 0;
        }
        return array[index] + sumNumber(array, index - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {//base
            return 1;

        } else {

            return n * factorial(n - 1);
        }
    }
}

