package com.prof.java;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String type = scanner.nextLine();
            if(type.equals("exit") || type.equals("pam")){
                break;
            }
        }
    }
}