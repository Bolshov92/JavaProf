package com.prof.homework.game.participant;

import java.util.Objects;

public class Participant {

    String name;
    int age;
    String category;

    public Participant(String name, int age, String category) {
        this.name = name;
        this.age = age;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParticipantCategory() {
        return category;
    }

    public void setParticipantCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", category='" + category + '\'' +
                '}';
    }

    public void print() {
        System.out.println("Participant : " + toString());
    }

}
