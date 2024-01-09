package com.prof.homework.stream._2024_01_08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Str1 {
    public static void main(String[] args) {
        /**
         * loop [while for fori if]
         * stream api
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        Optional<Integer> sum = list.stream()
                .filter(el -> el % 2 == 0) //2 4 6 8 10 12
                .map(el -> el * 10) //20 40 60 80 100 120
                .reduce(Integer::sum);

        int[] arr = {3, 2, 1, 6, 5, 4, 9, 8, 7};
        Arrays.stream(arr);

        Stream<String> stream = Stream.of("WE", "AS", "OI");
    }

    public boolean fil(Integer i) {
        return i % 2 == 0;
    }
}
