package com.prof.homework.HashMap;

import com.github.javafaker.Faker;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class UserApp {

    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {

        Map<User, String> ageSort = new TreeMap<>();
        ageSort.put(new User(FAKER.name().firstName(), 15), "Info");
        ageSort.put(new User(FAKER.name().firstName(), 20), "I");
        ageSort.put(new User(FAKER.name().firstName(), 30), "o");

        for (Map.Entry<User, String> e : ageSort.entrySet()) {
            System.out.println(e.getKey().getName()  + " " + e.getKey().getAge() + " "  + e.getValue());

        }


        Map<User, String> sort = new TreeMap<>(new UserComparator());
        sort.put(new User(FAKER.name().firstName(), 15), "Info");
        sort.put(new User(FAKER.name().firstName(), 20), "Info");
        sort.put(new User(FAKER.name().firstName(), 30), "Info");
        sort.put(new User(FAKER.name().firstName(), 20), "Info");
        sort.put(new User(FAKER.name().firstName(), 30), "Info");
        for(Map.Entry<User, String> e : sort.entrySet()){
            System.out.println(e.getKey().getName());
        }
    }
}
