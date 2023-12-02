package com.prof.homework.massiv_list;

import java.util.ArrayList;
import java.util.List;

public class UniqueElement {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("By");
        list.add("Welcome");
        list.add("Welcome");
        list.add("By");
        list.add("Try");
        list.add("To Do");


        System.out.println(uniqueElements(list));
    }

    public static List<String> uniqueElements(List<String> lists) {
        List<String> unique = new ArrayList<>();
        for (String e : lists) {
            if (!unique.contains(e)) {
                unique.add(e);
            }
        }
        return unique;
    }
}
