package com.telran.org.lessonfour;

public class ParentTest {

    public static void main(String[] args) {


        Parent childOne = ChildOne.create();
        Parent childTwo = new ChildTwo();

        childOne.printGreetings();
        childTwo.printGreetings();
        childOne.printThanks();
        childTwo.printWishes();





    }



}
