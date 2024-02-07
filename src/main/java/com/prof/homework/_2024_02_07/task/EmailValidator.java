package com.prof.homework._2024_02_07.task;

/**
 * Проверьте, что строка представляет
 * собой корректный адрес электронной почты (email).
 */
public class EmailValidator {
    public static boolean isValidEmail(String input) {

        return false;
    }

    public static void main(String[] args) {
        String email = "user@example.com";
        boolean isValid = isValidEmail(email);
        System.out.println("Is valid email address: " + isValid);
    }
}
