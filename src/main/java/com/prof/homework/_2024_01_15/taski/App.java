package com.prof.homework._2024_01_15.taski;

import com.prof.homework.massiv_list.UniqueElement;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        List<String> stringList = Stream.of("Hello", "Hi", "By", "Welcome", "GoodLuck")
                .toList();

        // System.out.println(gropingBy(stringList));
        // System.out.println(countingRepeats(stringList));
        //System.out.println(uniqueElement(stringList));
        // System.out.println(unionString(stringList));
        // System.out.println();
        // System.out.println(characters("Welcome"));
        //System.out.println();
        //List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
        //System.out.println("Sum of squares of odd numbers : " + sumOfSquaresOfOddNumbers(numbers));
        //System.out.println();

        List<String> strings = Arrays.asList("Slow", "DownTown", "Big", " Mac");
        // System.out.println(uniqueChars(strings));

        System.out.println(longestString(strings));


    }


    public static Set<String> deleteDuplicate(List<String> list) {
        Set<String> stringSet = list.stream()
                .collect(Collectors.toSet());
        return stringSet;
    }

    public static Map<Integer, List<String>> gropingBy(List<String> list) {
        Map<Integer, List<String>> listMap = list.stream()
                .collect(Collectors.groupingBy(String::length));
        return listMap;
    }

    public static Map<String, Long> countingRepeats(List<String> list) {
        Map<String, Long> listIntegerMap = list.stream()
                .collect(Collectors.groupingBy(el -> el, Collectors.counting()));
        return listIntegerMap;
    }

    public static List<String> uniqueElement(List<String> list) {
        List<String> stringList = list.stream()
                .distinct().toList();
        return stringList;
    }

    public static String unionString(List<String> list) {
        String str = list.stream()
                .collect(Collectors.joining());

        return str;
    }

    public static Set<Character> characters(String list) {
        Set<Character> characterSet = list.chars()
                .mapToObj(el -> (char) el)
                .collect(Collectors.toSet());
        return characterSet;
    }

    public static int sumOfObject(Person sum) {
        int age = Stream.of(
                        new Person("Alex", 25),
                        new Person("Piter", 20),
                        new Person("Kraft", 37),
                        new Person("Marry", 28))
                .collect(Collectors.summingInt(Person::getAge));
        return age;
    }

    public static Map<String, Double> countAverage(Person name) {
        Map<String, Double> stringDoubleMap = Stream.of(
                        new Person("Mike", 30),
                        new Person("Jake", 30),
                        new Person("Hum", 30),
                        new Person("Molly", 30),
                        new Person("Nike", 30))
                .collect(Collectors.groupingBy(Person::getName, Collectors.averagingInt(Person::getAge)));
        return stringDoubleMap;
    }

    public static int sumOfSquaresOfOddNumbers(List<Integer> numbers) {
        int sum = numbers.stream()
                .filter(el -> el % 2 != 0)
                .mapToInt(el -> el * el)
                .sum();
        return sum;
    }

    public static List<String> uniqueSortedWords(List<String> strings) {
        List<String> stringList = strings.stream()
                .flatMap(el -> List.of(el.split("\\s+")).stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        return stringList;
    }

    //  public static <T> List<T> filterByField(List<T> objects, String fieldName, Object value) throws NoSuchFieldException {
    //    return null;

    public static List<String> uniqueChars(List<String> strings) {
        List<String> list = strings.stream()
                .map(el -> getUniqueChars(el))
                .collect(Collectors.toList());
        return list;
    }


    private static String getUniqueChars(String input) {
        return input.chars()
                .mapToObj(el -> String.valueOf((char) el))
                .distinct()
                .collect(Collectors.joining());
    }

    public static String longestString(List<String> strings) {
        String longest = strings.stream()
                .max(Comparator.comparingInt(String::length))
                .toString();
        return longest;
    }
}
