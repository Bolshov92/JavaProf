package com.telran.org.lessonthree.party;

public class Child extends Guest implements Sleep {

    public Child(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("I am " + super.getName() + " and i want to sleep");
    }
}
