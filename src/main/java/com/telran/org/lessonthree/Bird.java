package com.telran.org.lessonthree;

public class Bird  implements Flyable, Eatable {
    @Override
    public void fly() {
        System.out.println(" im bird");
    }

    @Override
    public boolean canEat() {
        return false;
    }
}
