package com.prof.homework.NewYearTask.task.Game;

public class Adult extends Participant {
    public Adult(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println("Adult : " + toString());
    }
}

class Teenager extends Participant {

    public Teenager(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println("Teenager : " + toString());
    }
}

class Pupil extends Participant {

    public Pupil(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println("Pupil : " + toString());
    }
}