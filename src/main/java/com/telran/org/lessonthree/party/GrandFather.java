package com.telran.org.lessonthree.party;

public class GrandFather extends Guest implements DrinkAlcohol, LikeDance {

    public GrandFather(String name, int age) {
        super(name, "F", age);
    }

    @Override
    public void drink() {
        System.out.println("Hi I am " + getName() + " I want a drink ");

    }

    @Override
    public void dance() {
        System.out.println("Hi I am " + getName() + " I want a dance");

    }
}
