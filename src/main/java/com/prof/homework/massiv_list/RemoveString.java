package com.prof.homework.massiv_list;

import com.prof.homework.opp.transportPark.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Car");
        list.add("Bus");
        list.add("Lorry");

        System.out.println(removeString(list,"Bus"));

    }

    public static List<String> removeString(List<String> lists ,String word){
        for(int i = 0; i < lists.size(); i ++)  {
            if(lists.get(i).equals(word)){
                lists.remove(i);
            }
        }
        return lists;
    }
}
