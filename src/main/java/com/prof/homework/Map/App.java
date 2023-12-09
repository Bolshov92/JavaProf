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
        System.out.println(quantity(key));

        Map<String, Integer> sum = new HashMap();
        sum.put("Antract", 2);
        sum.put("Welcome", 3);
        sum.put("Ary", 4);
        sum.put("Choose", 5);
        sum.put("Can", 6);
        sum.put("quality", 7);
        System.out.println(withStartA(sum));
        System.out.println();

        Map<Integer, List<String>> str = new HashMap<>();
        str.put(1, new ArrayList<>(Arrays.asList("ello", "ain", "APPP")));
        str.put(2, new ArrayList<>(Arrays.asList("Welcome", "vector", "Aprpr")));
        str.put(3, new ArrayList<>(Arrays.asList("Did", "Try", "WLWLW")));
        startWithVowel(str);
        System.out.println();

        Map<Integer, Integer> max = new HashMap<>();
        max.put(1, 12);
        max.put(20, 40);
        max.put(5, 50);
        max.put(60, 20);
        max.put(10, 30);
        maxKey(max);
        System.out.println();

        Map<String, String> reverse = new HashMap<>();
        reverse.put("anna", "anna");
        reverse.put("put", "tup");
        reverse.put("Hello", " 3");
        reverse.put("Welcome", "4");
        System.out.println(reversePair(reverse));
        System.out.println();

        Map<String, Integer> transformed = new HashMap<>();
        transformed.put("anna", 5);
        transformed.put("put", 7);
        transformed.put("Hello", 8);
        transformed.put("Welcome", 10);
        System.out.println(transformString(transformed));
        System.out.println();

        Map<Integer, List<String>> hash = new HashMap<>();
        hash.put(1, new ArrayList<>(Arrays.asList("Hello", "hello", "hi")));
        hash.put(2, new ArrayList<>(Arrays.asList("Welcome", "Create", "Boss")));
        hash.put(3, new ArrayList<>(Arrays.asList("Did", "Try", "Doing")));
        System.out.println(transform(hash));
    }

    public static int quantity(Map<String, String> map) {
        int count = 0;
        for (Map.Entry<String, String> e : map.entrySet()) {
            if (e.getKey().length() == e.getValue().length()) {
                count++;
            }
        }
        return count;
    }

    public static int withStartA(Map<String, Integer> start) {
        int count = 0;
        for (Map.Entry<String, Integer> e : start.entrySet()) {
            if (e.getKey().startsWith("A")) {
                count += e.getValue();
            }
        }
        return count;
    }

    public static boolean checkStart(String string) {
        List<Character> list = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        if (list.contains(string.charAt(0))) {
            return true;
        }
        return false;
    }

    public static void startWithVowel(Map<Integer, List<String>> vowel) {
        for (Map.Entry<Integer, List<String>> list : vowel.entrySet()) {
            System.out.print("Key -  " + list.getKey() + " ");
            for (String e : list.getValue()) {
                if (checkStart(e)) {
                    System.out.print(e + " ");
                }
            }
            System.out.println();
        }
    }

    public static void maxKey(Map<Integer, Integer> key) {
        int maxKey = 0;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> e : key.entrySet()) {
            if (e.getValue() > maxValue) {
                maxValue = e.getValue();
                maxKey = e.getKey();
            }
        }
        System.out.println("Max Value : " + maxValue + " and  This pair  : " + maxKey + " " + maxValue);
    }

    public static boolean reversePair(Map<String, String> rev) {
        for (Map.Entry<String, String> e : rev.entrySet()) {
            String key = e.getKey();
            String value = e.getValue();
            if (rev.containsKey(reverseString(value))) {
                System.out.println("Pair is found : " + e.getKey() + " " + e.getValue());
                return true;
            }
        }
        return false;
    }

    public static String reverseString(String value) {
        return new StringBuilder(value).reverse().toString();
    }

    public static Map<String, String> transformString(Map<String, Integer> map) {
        Map<String, String> string = new HashMap<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            Integer value = e.getValue();
            String transform = String.valueOf(value * 2);
            string.put(e.getKey(), transform);
        }
        return string;
    }

    public static Map<Integer, Integer> transform(Map<Integer, List<String>> trs) {
        Map<Integer, Integer> listTransform = new HashMap<>();

        for (Map.Entry<Integer, List<String>> e : trs.entrySet()) {
            List<String> strings = e.getValue();
            int total = totalCharts(strings);
            listTransform.put(e.getKey(), total);
        }
        return listTransform;
    }

    public static int totalCharts(List<String> str) {
        int count = 0;
        for (String e : str) {
            count += e.length();
        }
        return count;
    }
}


