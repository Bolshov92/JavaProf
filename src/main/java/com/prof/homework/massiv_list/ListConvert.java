package com.prof.homework.massiv_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListConvert {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("By");
        list.add("Weak");
        list.add("Strong");
        list.add("Hi");
        list.add("Word");
        list.add("Person");
        list.add("Tired");
        list.add("Late");

        System.out.println(Convert(list));
    }

    public static List<Integer> Convert(List<String> lists){
        List<Integer> integers = new ArrayList<>();
        for (String e : lists){
            integers.add(e.length());
        }
        return integers;
    }
}
