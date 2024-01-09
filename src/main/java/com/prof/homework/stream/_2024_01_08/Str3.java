package com.prof.homework.stream._2024_01_08;

import java.util.Arrays;
import java.util.List;

public class Str3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 6);

        //count
        long l = list.stream().count();

        //distinct
        long s = list.stream().distinct().count();

        //min, max
        list.stream().min(Integer::compareTo);
        list.stream().max(Integer::compareTo);

    }
}
