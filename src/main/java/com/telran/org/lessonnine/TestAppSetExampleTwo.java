package com.telran.org.lessonnine;

import java.util.HashSet;
import java.util.Set;

public class TestAppSetExampleTwo {

    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(1);
        integerSet.add(4);
        integerSet.add(11);
        integerSet.add(4);

        System.out.println(integerSet);
//        System.out.println("Set size " + integerSet.size());
//        System.out.println("contains 3 is : " + integerSet.contains(3));
//        integerSet.remove(2);
//        System.out.println("Set size " + integerSet.size());
//
//        Person two = new Person("Two");
//        Person one = new Person("One");
//        HashSet<Person> personSet = new HashSet<>();
//        personSet.add(one);
//        personSet.add(two);
//        System.out.println(personSet);

    }
}
