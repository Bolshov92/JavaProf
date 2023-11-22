package com.telran.org.lessonseven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorAppExampleTwo {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }
        System.out.println(integerList);

//        for (Integer e : integerList) {
//            if (e % 2 != 0) {
//                integerList.remove(e);
//            }

//            for (int i = 0; i < integerList.size(); i++) {
//                if (integerList.get(i) % 2 != 0) {
//                    integerList.remove(i);
//                }
//            }

        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element % 2 != 0) {
                System.out.print(element + " ");
                iterator.remove();
            }
        }
        System.out.println();
        System.out.print(integerList);
    }
}

