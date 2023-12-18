package com.prof.homework.functionalInterface;

import com.sun.source.tree.BreakTree;

import java.util.Locale;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        length(String::length, "String");
        System.out.println(add((a, b) -> {
            int x = a + b;
            return x;
        }, 5, 6));

        sub((a, b) -> {
            int sum = a - b;
            return sum;
        }, 10, 2);

        div((a, b) -> {
            int x = a / b;
            return x;
        }, 10, 2);

        multiply((a, b) -> {
            int x = a * b;
            return x;
        }, 5, 5);


        divide((SafeDivision) (a, b) -> {
            if (a == 0 || b == 0) {
                return Optional.of(0.0d);
            }
            return Optional.of(a / b);
        }, 10, 5);

        System.out.println(MakeUpperCase(new UpperCaseConverter() {
            @Override
            public String convector(String str) {
                return str.toUpperCase(Locale.of(str));
            }
        }, "abc"));

        Logger(a -> System.out.println(a),"Hello World");
    }

    static int length(StringLength itf, String str) {
        return itf.getLength(str);
    }

    static int add(NumberOperation operation, int a, int b) {
        return operation.operate(a, b);
    }

    static int sub(NumberOperation operation, int a, int b) {
        return operation.operate(a, b);
    }

    static int div(NumberOperation operation, int a, int b) {
        return operation.operate(a, b);
    }

    static int multiply(NumberOperation operation, int a, int b) {
        return operation.operate(a, b);
    }

    static Optional<Double> divide(SafeDivision division, double a, double b) {

        return Optional.of(0.0);
    }

    static String MakeUpperCase(UpperCaseConverter converter, String str) {
        return converter.convector(str);
    }

    static void Logger(Logger log , String a){
        log.log(a);
    }
}



