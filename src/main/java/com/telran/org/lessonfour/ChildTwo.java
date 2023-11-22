package com.telran.org.lessonfour;

public class ChildTwo extends Parent {

//    public static String HELLO = "Hello";
//    public static void printHello(){
//        System.out.println("Hey");
//    }

    @Override
    public void printGreetings() {
        System.out.println("Hello i am child two" );
    }

    public void printAll(){
        printGreetings();
        printThanks();
        printWishes();
    }
}
