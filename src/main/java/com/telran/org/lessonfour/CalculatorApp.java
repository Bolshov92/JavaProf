package com.telran.org.lessonfour;

public class CalculatorApp {

    public static void main(String[] args) {

        System.out.println(mult(2, 2));
        System.out.println(mult(2.2, 3.3));
        System.out.println(mult(2, 3, 4));
    }

    private static int mult(int a, int b) {
        return a * b;
    }

    private static int mult(int a, int b, int c) {
        return a * b * c;
    }

    private static double mult(double a, double b) {
        return a * b;
    }

}
