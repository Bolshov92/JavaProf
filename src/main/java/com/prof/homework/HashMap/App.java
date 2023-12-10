package com.prof.homework.HashMap;

import com.github.javafaker.Faker;

import java.util.*;

public class App {

    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {

        Map<User, String> sort = new TreeMap<>(new UserComparator());
        sort.put(new User("Alex", 15), "Info");
        sort.put(new User("Slava", 20), "Info");
        sort.put(new User("Vova", 30), "Info");
        System.out.println(sort);
        System.out.println();

        Map<String, Integer> map = new HashMap<>();
        map.put("Alex", 15);
        map.put("Slava", 18);
        map.put("Jake", 20);
        map.put("Jon", 25);
        map.put("Tayler", 30);
        map.put("Bled", 12);
        System.out.println(dobleAge(map));
        System.out.println();

        Map<Integer, String> treeMap = new HashMap<>();
        treeMap.put(50, "Alex");
        treeMap.put(102, "Slava");
        treeMap.put(99, "Jake");
        treeMap.put(105, "Jon");
        treeMap.put(43, "Tayler");
        treeMap.put(40, " Bled");


        System.out.println(filterMap(treeMap));
        System.out.println();

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(12, "Road");
        map1.put(15, "Street");
        map1.put(20, "Stops");
        System.out.println(convectorTreeMap(map1));
        System.out.println();

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Alex", 15);
        map2.put("Slava", 18);
        map2.put("Jake", 20);
        map2.put("Jon", 25);
        map2.put("Tik", 30);
        map2.put("Bled", 12);
        System.out.println(convertValue(map2));
        System.out.println();

        Map<String, Integer> map3 = new TreeMap<>();
        map3.put("Alex", 40);
        map3.put("Slava", 51);
        map3.put("Jake", 60);
        map3.put("Jon", 30);
        map3.put("Tayler", 70);
        map3.put("Bled", 18);
        System.out.println(value(map3));
        System.out.println();

        Map<String, List<Integer>> students = new HashMap<>();
        students.put("Alex", Arrays.asList(8, 10, 7, 4));
        students.put("Slava", Arrays.asList(10, 10, 8, 4));
        students.put("Victor", Arrays.asList(8, 18, 6, 5));
        students.put("Maxim", Arrays.asList(10, 10, 3, 4));
        System.out.println(averageList(students));


    }

    public static Map<String, Integer> dobleAge(Map<String, Integer> map) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            String name = e.getKey();
            Integer age = e.getValue();
            result.put(name, age * 2);

        }
        return result;
    }

    public static Map<Integer, String> filterMap(Map<Integer, String> treeMap) {
        Map<Integer, String> newMap = new TreeMap<>();
        for (Map.Entry<Integer, String> e : treeMap.entrySet()) {
            if (e.getKey() > 100) {
                newMap.put(e.getKey(), e.getValue());
            }
        }
        return newMap;
    }

    private static Map<String, Integer> convectorTreeMap(Map<Integer, String> map) {
        Map<String, Integer> treeMap = new TreeMap<>();
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            treeMap.put(e.getValue(), e.getKey());
        }
        return treeMap;
    }

    private static List<Integer> convertValue(Map<String, Integer> map) {
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            list.add(e.getValue());
        }
        return list;
    }

    private static Map<Integer, String> value(Map<String, Integer> map) {
        Map<Integer, String> map1 = new HashMap<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > 50) {
                map1.put(e.getValue(), e.getKey());
            }
        }
        return map1;
    }

    private static Map<Integer, List<String>> averageList(Map<String, List<Integer>> listNumber) {
        Map<Integer, List<String>> studentList = new TreeMap<>();

        if (listNumber != null) {
            for (Map.Entry<String, List<Integer>> map : listNumber.entrySet()) {
                List<Integer> numbers = map.getValue();
                int average = (numbers != null && !numbers.isEmpty()) ? average(numbers) : 0;

                studentList.put(average, studentList.computeIfAbsent(average, k -> new ArrayList<>())).add(map.getKey());
            }
        }

        return studentList;
    }

    private static int average(List<Integer> listGrade) {
        int sum = 0;
        for (int grade : listGrade) {
            sum += grade;
        }
        return (int) sum / listGrade.size();
    }
}
