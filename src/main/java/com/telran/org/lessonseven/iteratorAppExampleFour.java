package com.telran.org.lessonseven;

import java.util.ArrayList;
import java.util.List;

public class iteratorAppExampleFour {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        for (String element : list) {
            System.out.print(" " + element);
        }
        System.out.println();
        list.forEach(element -> System.out.print(" " + element));


    }
}
