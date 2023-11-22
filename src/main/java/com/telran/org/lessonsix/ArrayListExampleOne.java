package com.telran.org.lessonsix;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleOne {
    public static void main(String[] args) {
        List<String> stringListOne = new ArrayList<>();
        stringListOne.add("Red");
        stringListOne.add("White");
        System.out.println(stringListOne);

        List<String> stringListTwo = new ArrayList<>();
        stringListTwo.add("Black");
        stringListTwo.add("Green");
        stringListTwo.add("Pink");
        stringListTwo.add("Red");
        System.out.println(stringListTwo);

        List<String> stringListThree = new ArrayList<>();
        stringListThree.addAll(stringListOne);
        stringListThree.addAll(stringListTwo);
        System.out.println(stringListThree);
    }
}
