package com.prof.homework._2024_01_10._2024_01_10;

import org.apache.commons.lang3.CharEncoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Word");
        stringList.add("Car");
        stringList.add("House");
//        System.out.println(joinByComma(stringList));

        List<Integer> integerList = Arrays.asList(2, 4, 5, 7);
        System.out.println(sumOfList(integerList));

        System.out.println(getSquares(integerList));
        System.out.println(filterGreaterThan(integerList, 4));

        System.out.println(containsNumber(integerList, 8));

        System.out.println(findMax(integerList));

        List<Character> charactersList = new ArrayList<>();
        charactersList.add('a');
        charactersList.add('b');
        charactersList.add('c');
        charactersList.add('d');
        charactersList.add('e');
        System.out.println();
        System.out.println(filterByAsciiValue(charactersList, 30));

    }

    private static List<String> filterByLength(List<String> input, int length) {
        return input.stream()
                .filter(el -> el.length() > length)
                .toList();
    }

    List<String> toUpperCase(List<String> input) {
        return input.stream()
                .map(el -> el.toUpperCase())
                .toList();
    }

    Optional<String> findFirstStartingWith(List<String> input, char letter) {
        return input.stream()
                .filter(el -> el.startsWith(String.valueOf(letter)))
                .findFirst();
    }

    public static String joinByComma(List<String> input) {
        return input.stream()
                .collect(Collectors.joining(","));

    }

    long countContainingChar(List<String> input, char ch) {
        return input.stream()
                .filter(el -> el.contains(String.valueOf(ch)))
                .count();
    }

    public static int sumOfList(List<Integer> input) {
        Optional<Integer> sum = input.stream()
                .reduce(Integer::sum);
        return sum.get();
    }

    public static List<Integer> getSquares(List<Integer> input) {
        return input.stream()
                .map(el -> el * el)
                .toList();
    }

    public static List<Integer> filterGreaterThan(List<Integer> input, int minValue) {
        return input.stream()
                .filter(el -> el > minValue)
                .toList();
    }

    public static boolean containsNumber(List<Integer> input, int number) {
        return input.stream()
                .anyMatch(el -> el == number);
    }

   public static Optional<Integer> findMax(List<Integer> input){
       Optional<Integer> max = input.stream()
               .max(Integer::compareTo);
       return max;
   }
   public static List<String> convertToStringList(List<Character> input){
        return input.stream()
                .map(Object :: toString)
                .collect(Collectors.toList());
    }

   public static List<Character> filterByAsciiValue(List<Character> input, int ascii){
        return input.stream()
                .filter(el -> (int) el == ascii )
                .collect(Collectors.toList());
   }
}
