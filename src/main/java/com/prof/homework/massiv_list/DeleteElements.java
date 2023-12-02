package com.prof.homework.massiv_list;

import java.util.ArrayList;
import java.util.List;

public class DeleteElements {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Welcome");
        list.add("Hello");
        list.add("Choose");
        list.add("Try");

        System.out.println(deleteElements(list,5));
    }

    public static List<String> deleteElements(List<String> lists, int num){
        List<String> list2 = new ArrayList<>();
        for (String e : lists){
            if(e.length() > num){
                list2.add(e);
            }
        }
        return list2;
    }
}
