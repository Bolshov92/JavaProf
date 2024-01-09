package com.prof.homework.stream._2024_01_08;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Str2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        List<String> stringList = Arrays.asList("We", "Op");
        List<String> t = stringList.stream()
                .map(el -> {
                    if(el.startsWith("W")) {
                        el = el.toLowerCase();
                    }
                    System.out.println(el);
                    return el;
                }).collect(Collectors.toList());
        System.out.println(t);
    }
}
