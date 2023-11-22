package com.telran.org.lessonseven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAppExampleOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        Iterator<String> iterator = list.iterator();
        while ((iterator.hasNext())) {
            String next = iterator.next();
            System.out.print(next + " ");
        }
        // A B C D E

        System.out.println();
        Iterator<String> iteratorNew = list.iterator();
        System.out.println(iteratorNew.next());
        System.out.println(iteratorNew.next());
        System.out.println(iteratorNew.next());
    }
}
