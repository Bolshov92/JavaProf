package com.telran.org.lessonsix;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleTwo {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Black");
        stringList.add("Green");
        stringList.add("Pink");
        stringList.add("Red");
        System.out.println(stringList);

        List<String> stringListToLowerCase = toLowerCase(stringList);
        System.out.println("New List " + stringListToLowerCase);

        toLowerCaseInplace(stringList);
        System.out.println("Original List " + stringList);

    }

    private static List<String> toLowerCase(List<String> stringList) {
        List<String> newList = new ArrayList<>();
        for (String value : stringList) {
            String newString = value.toLowerCase();
            newList.add(newString);
        }
        return newList;
    }

    private static void toLowerCaseInplace(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            String value = stringList.get(i);
            String newString = value.toUpperCase();
            stringList.set(i, newString);
        }
    }
}