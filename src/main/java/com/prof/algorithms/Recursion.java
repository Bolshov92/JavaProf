package com.prof.algorithms;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number N : ");
        int n = scanner.nextInt();
        degreeOff(n);
        System.out.println();

        System.out.println("Type numbers to calculate 2 : ");
        int x = scanner.nextInt();
        int sum = sumOfDigit(x);
        System.out.println("Sum of Numbers : " + sum);
        System.out.println();

        System.out.print("Type Fibonacci numbers up to : ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        String text = "level";
        System.out.println(isPalindrome(text));
    }

    public static int degreeOff(int x) {
        if (x == 2) {
            System.out.println("Yes");
            return 0;
        } else if (x < 2) {
            System.out.println("No");
            return 0;
        }
        if (x % 2 == 0) {
            return degreeOff(x / 2);
        } else {
            System.out.println("No");
            return 0;
        }
    }

    public static int sumOfDigit(int n) {
        if (n < 10) { //Base
            return n;
        }
        return n % 10 + sumOfDigit(n / 10);
    }

    public static int fibonacci(int num) {
        if (num <= 1) {//base
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static boolean check(String string, int head, int tail) {
        if (head >= tail) {
            return true;
        } else {
            return string.charAt(head) == string.charAt(tail) && check(string, head + 1, tail - 1);
        }
    }

    public static boolean isPalindrome(String str) {
        System.out.print("Is Palindrome : ");
        if (str.length() <= 1) {
            return true;
        } else {
            String string = str.toUpperCase();
            return check(string, 0, string.length() - 1);
        }
    }
}

