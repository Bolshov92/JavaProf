package com.prof.homework.massiv_list;

import java.util.ArrayList;
import java.util.List;

public class CreationList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(creation(list,8));
    }

    public static List<Integer> creation(List<Integer> lists , int numberUp){
        List<Integer> list2 = new ArrayList<>();
        for(Integer e : lists){
            if(numberUp < e){
                list2.add(e);
            }
        }
        return list2;
    }
}
