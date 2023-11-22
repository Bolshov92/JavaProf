package com.telran.org.lessonfour;

import java.util.Scanner;

public class EnumApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input current day : ");
        String dayAsString = scanner.nextLine().toUpperCase();
        Day input = Day.valueOf(dayAsString);


        switch (input){
            case FRIDAY:
                System.out.println("Cool");
                break;
            case MONDAY:
                System.out.println("Hey");
                break;
            default:
                System.out.println("Other");
        }
    }

    public static void printAllDays() {
        Day[] values = Day.values();
        for (Day value : values) {
            System.out.println(value);
        }
    }
}

