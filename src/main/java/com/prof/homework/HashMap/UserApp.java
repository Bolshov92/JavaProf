package com.prof.homework.HashMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class UserApp {


    public static void main(String[] args) {

        Map<User, String> ageSort = new TreeMap<>();
        ageSort.put(new User("Alex", 15), "Info");
        ageSort.put(new User("Slava", 20), "Info");
        ageSort.put(new User("Vova", 30), "Info");

        for (Map.Entry<User, String> e : ageSort.entrySet()) {
            System.out.println(e.getKey() + e.getValue());

        }


        Map<User, String> sort = new TreeMap<>(new UserComparator());
        sort.put(new User("Alex", 15), "Info");
        sort.put(new User("Wlava", 20), "Info");
        sort.put(new User("Vova", 30), "Info");
        sort.put(new User("Blava", 20), "Info");
        sort.put(new User("Zova", 30), "Info");
        for(Map.Entry<User, String> e : sort.entrySet()){
            System.out.println(e.getKey().getName());
        }
    }
}
