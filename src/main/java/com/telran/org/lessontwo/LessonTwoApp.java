package com.telran.org.lessontwo;

public class LessonTwoApp {


    public static void main(String[] args) {

        Cat cat = new Cat(15);
        cat.voice();
        cat.setColor("Red");

        WildCat wildCat = new WildCat(5);
        wildCat.voice();
        wildCat.getAge();
        wildCat.setColor("White");

        LittleCat littleCat = new LittleCat(10);
        littleCat.voice();
        littleCat.jump();
        littleCat.setColor("Black");

        LittleCat littleCatTwo = new LittleCat(15);
        littleCatTwo.voice();
        littleCatTwo.setColor("Yellow");

        SeaCat seaCat = new SeaCat(20);
        seaCat.voice();
        seaCat.setHeight(20);
        seaCat.swim();
        seaCat.setColor("Blue");

        System.out.println("Cat color = " + cat.getColor());
        System.out.println("WildCat color = " + wildCat.getColor());
        System.out.println("littleCat color = " + littleCat.getColor());
        System.out.println("littleCatTwo color = " + littleCatTwo.getColor());
        System.out.println("SeaCat color = " + seaCat.getColor());

    }
}
