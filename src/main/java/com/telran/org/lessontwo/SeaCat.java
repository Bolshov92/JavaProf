package com.telran.org.lessontwo;

import java.sql.SQLOutput;

public class SeaCat extends BigCat {

    public SeaCat(int age) {
        super(age);
    }

    public void swim() {
        System.out.println("i can swim");

    }

    @Override
    public void voice() {
//        super.voice();
        System.out.println("Hello");
    }
}
