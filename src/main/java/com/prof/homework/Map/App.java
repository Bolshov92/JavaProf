package com.prof.homework.Map;

import com.github.javafaker.Faker;

import java.util.*;

public class App {
    public static final Faker FAKER = new Faker();
    public static void main(String[] args) {

        Map<String, String> key = new HashMap();
        key.put(FAKER.name().name(), FAKER.address().lastName());
        key.put("Welcome", "By");
        key.put("Try", "Did");
        key.put("Choose", "Weather");
        key.put("Can", "answer");
        key.put("quality", "Bad");
        for (Map.Entry<String, String> e : key.entrySet()) {
            if (e.getKey().length() == e.getValue().length()) {
                System.out.println(e);
            }
        }
        int count = 0;
        Map<String, Integer> sum = new HashMap();
        sum.put("Hello", 2);
        sum.put("Welcome", 3);
        sum.put("Cry", 4);
        sum.put("Choose", 5);
        sum.put("Can", 6);
        sum.put("quality", 7);
        for (Map.Entry<String, Integer> e : sum.entrySet()) {
            if (e.getKey().startsWith("C")) {
                count += e.getValue();
            }
        }
        System.out.println(count);

        Map<Integer, List<String>> str = new HashMap<>();
        str.put(1, new ArrayList<>(Arrays.asList("Hello", "main", "APPP")));
        str.put(2, new ArrayList<>(Arrays.asList("Welcome", "vector", "Aprpr")));
        str.put(3, new ArrayList<>(Arrays.asList("Did", "Try", "WLWLW")));

        for (Map.Entry<Integer, List<String>> list : str.entrySet()) {
            for (String e : list.getValue()) {
                if (checkStart(e)) {
                    System.out.println(e);
                }
            }
        }
    }

    public static boolean checkStart(String string) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"));
        for (String e : list) {
            if (list.contains(string.charAt(0))) {
                return true;
            }
        }return false;
    }

}

