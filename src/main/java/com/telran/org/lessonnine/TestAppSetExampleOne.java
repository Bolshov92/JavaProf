package com.telran.org.lessonnine;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestAppSetExampleOne {

    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        //add - add element to set
        sortedSet.add("A");
        sortedSet.add("B");
        sortedSet.add("A");
        sortedSet.add("F");
        sortedSet.add("C");

        System.out.println(sortedSet);
        //last and first - get last and first element from sorted set(use SortedSet)
        System.out.println("Last Element " + sortedSet.last());
        System.out.println("First Element " + sortedSet.first());
        //contains - check that element exists in set
        System.out.println("Contains " + sortedSet.contains("E"));
        System.out.println("Contains " + sortedSet.contains("B"));
        //remove - delete element from set
        sortedSet.remove("B");

        System.out.println(sortedSet);

        System.out.println("Iterate with foreach : ");
        for(String value : sortedSet){
            System.out.print(" " + value);
        }
        System.out.println();
        //Example with own object
        Person person = new Person("One");
        Person person1 = new Person("Two");
        Set<Person> personSet = new TreeSet<>();
        personSet.add(person);
        personSet.add(person1);

        System.out.println(personSet);

    }
}
