package com.prof.homework._2024_02_07.task;

import java.util.List;

/**
 * Найдите все строковые литералы в коде Java,
 * заключенные в двойные кавычки, исключая символы экранирования.
 */
public class StringLiteralFinder {
    public static List<String> findStringLiterals(String input) {

        return null;
    }

    public static void main(String[] args) {
        String code = "String message = \"Hello, world!\";\n" +
                      "String path = \"C:\\\\Program Files\\\\Java\";";
        List<String> stringLiterals = findStringLiterals(code);
        for (String literal : stringLiterals) {
            System.out.println(literal);
        }
    }
}
