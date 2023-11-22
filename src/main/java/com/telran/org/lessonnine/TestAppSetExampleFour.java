package com.telran.org.lessonnine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestAppSetExampleFour {
    public static void main(String[] args) {
        List<String> str = List.of("One", "Two", "One", "Three", "Four", "Three");
        List<String> dublicateList = getDublicateList(str);
        System.out.println("Dublicate object : " + dublicateList);
    }

    private static List<String> getDublicateList(List<String> stringList) {
        Set<String> uniqueSet = new HashSet<>();
        List<String> dublicateList = new ArrayList<>();
        for (String value : stringList) {
            if (!uniqueSet.add(value)) {
                dublicateList.add(value);
            }
        }
        return dublicateList;
    }
}

