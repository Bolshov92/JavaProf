package com.prof.homework._2024_02_07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReGex4 {
    public static void main(String[] args) {
       String cardNumber = "25639874120254120222698";
       String regex = "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})";

       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(cardNumber);

       String newStr = matcher.replaceAll
               ("CARD NUMBER $1 $2 $3 $4 EXPIRATION DATE $5/$6 CVV: $7");

        System.out.println(newStr);
    }
}