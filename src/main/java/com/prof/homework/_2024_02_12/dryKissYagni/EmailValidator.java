package com.prof.homework._2024_02_12.dryKissYagni;
public class EmailValidator {
    public static boolean validateEmail(String email) {
         String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
         boolean c = email.matches(emailRegex);
        return c;
    }
}

