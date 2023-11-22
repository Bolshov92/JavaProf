package com.telran.org.lessonsix;

import com.telran.org.lessonfour.CreditCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2); // add : add element to the end fo the list
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(1, 6);// insert element to certain index

        System.out.println(list);
        System.out.println("Size of list = " + list.size());//size() - real size of list
        System.out.println(list.get(1));//get(int index) - get element by index

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Elemen on index " + i + " = " + list.get(i));
        }

        for (Integer element : list) {
            System.out.println("Element = " + element);
        }

        list.remove(1);//delete element by index
        System.out.println(list);

        list.remove(Integer.valueOf(5));//delete Object
        System.out.println(list);

        List<String> stingList = new ArrayList<>();
        stingList.add("Hello");
        stingList.add("World");
        System.out.println(stingList);
        stingList.remove("Hello");
        System.out.println(stingList);
    }
}
