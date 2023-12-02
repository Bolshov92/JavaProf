package com.prof.homework.massiv_list;

import java.util.ArrayList;
import java.util.List;

public class CombineList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Welcome");
        list.add("By");

        System.out.println(combine(list));

    }

    public static StringBuilder combine(List<String> lists) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String e : lists) {
            stringBuilder.append(e);
        }
        return stringBuilder;

    }
}
