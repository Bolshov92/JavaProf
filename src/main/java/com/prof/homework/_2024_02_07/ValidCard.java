package com.prof.homework._2024_02_07;

import java.util.Random;

public class ValidCard {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        String cardNumber = generateValidCardNumber();
        System.out.println(cardNumber);
    }

    public static String generateValidCardNumber() {
        int[] numbers = new int[16];
        numbers[0] = 4; // Предполагаем, что карта - Visa, поэтому первая цифра 4
        for (int i = 1; i < 15; i++) {
            numbers[i] = RANDOM.nextInt(10);
        }
        numbers[15] = calculateCheckDigit(numbers);
        return numbersToString(numbers);
    }

    public static int calculateCheckDigit(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            int digit = numbers[i];
            if (i % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
        }
        return (sum * 9) % 10;
    }

    public static String numbersToString(int[] numbers) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            newString.append(numbers[i]);
        }
        return newString.toString();
    }
}