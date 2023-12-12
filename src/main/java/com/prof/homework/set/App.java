package com.prof.homework.set;

import java.sql.SQLOutput;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Alex");
        map.put("b", "Jake");
        map.put("c", "Viktor");
        map.put("D", "Jon");
        printMap(map);
        System.out.println();

        System.out.println(findKeysByValue(map, "Alex"));

        Map<String, String> map1 = new HashMap<>();
        map1.put("A", "Alex");
        map1.put("B", "Jake");
        map1.put("C", "Jake");
        map1.put("D", "Slava");
        Map<String, String> map2 = new HashMap<>();
        map2.put("D", "Slava");
        map2.put("G", "Goran");
        map2.put("G", "Mayk");
        map2.put("F", "Toni");
        printMap(map);
        System.out.println();
        System.out.println(mergeMapsIfUniqueKeys(map1, map2));
        System.out.println();

        System.out.println(invertMap(map1));
        System.out.println();

        Map<String, String> map3 = new HashMap<>();
        map3.put("A", "Alex");
        map3.put("B", "Jake");
        map3.put("C", "Alex");
        map3.put("D", "Slava");
        System.out.println(countUniqueValues(map3));
        System.out.println();

        Set<Map<Integer, String>> setOfMaps = new HashSet<>();
        Map<Integer, String> value = new HashMap<>();
        value.put(1, "Console");
        value.put(2, "Table");
        value.put(3, "Pen");
        setOfMaps.add(value);
        System.out.println(findAllValues(setOfMaps));
        System.out.println();

        System.out.println(sumAllKeys(setOfMaps));
        System.out.println();

        System.out.println(containsValue(setOfMaps, "Ten"));
        System.out.println();

    }

    // Вывести все ключи и значения
    public static void printMap(Map<String, String> map) {

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e);
        }
    }

    // Найти ключи, значения которых равны заданной строке.
    public static Set<String> findKeysByValue(Map<String, String> map, String value) {
        Set<String> list = new HashSet<>();
        for (Map.Entry<String, String> e : map.entrySet()) {
            if (e.getValue().equals(value)) {
                list.add(e.getKey());
                System.out.print(" Key by Value : ");
            }
        }
        return list;
    }

    // Объединить две мапы, если у них нет одинаковых ключей.
    public static Map<String, String> mergeMapsIfUniqueKeys(Map<String, String> map1, Map<String, String> map2) {
        Map<String, String> combine = new HashMap<>(map1);
        for (Map.Entry<String, String> e : map2.entrySet()) {
            if (!combine.containsKey(e.getKey())) {
                combine.put(e.getKey(), e.getValue());
            }
        }
        return combine;
    }

    //Инвертировать мапу (ключи становятся значениями и наоборот).
    public static Map<String, String> invertMap(Map<String, String> map) {
        Map<String, String> invert = new HashMap<>();
        for (Map.Entry<String, String> e : map.entrySet()) {
            invert.put(e.getValue(), e.getKey());
        }
        return invert;
    }

    //Найти количество уникальных значений в мапе
    public static int countUniqueValues(Map<String, String> map) {
        Set<String> countValue = new HashSet<>();
        int count = 0;
        for (Map.Entry<String, String> e : map.entrySet()) {
            if (!countValue.contains(e.getValue())) {
                countValue.add(e.getValue());
                count++;
            } else if (countValue.contains(e.getValue())) {
                count--;
            }
        }
        return count;
    }

    //Вывести все строки, которые являются значениями в любой из мап.
    public static Set<String> findAllValues(Set<Map<Integer, String>> setOfMaps) {
        Set<String> list = new HashSet<>();
        for (Map<Integer, String> e : setOfMaps) {
            list.addAll(e.values());
        }
        return list;
    }

    //Найти сумму всех ключей всех мап.
    public static int sumAllKeys(Set<Map<Integer, String>> setOfMaps) {
        int countSum = 0;
        for (Map<Integer, String> e : setOfMaps) {
            for (int element : e.keySet()) {
                countSum += element;
            }
        }
        return countSum;
    }

    //Определить, содержится ли заданная строка как значение хотя бы в одной из мапы.
    public static boolean containsValue(Set<Map<Integer, String>> setOfMaps, String value) {
        for (Map<Integer, String> e : setOfMaps) {
            System.out.print("String contains Value : ");
            if (e.containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    //Найти все строки, которые начинаются с заданного символа во всех вложенных сетах.
    public static Set<String> findAllStringsWithChar(Set<Map<Character, Set<String>>> complexSet, char c) {
        Set<String> result = new HashSet<>();
        for (Map<Character, Set<String>> e : complexSet) {
            for (Set<String> element : e.values()) {
                for (String str : element) {
                    if (str.startsWith(String.valueOf(c))) {
                        result.add(str);
                    }
                }
            }
        }
        return result;
    }
}



