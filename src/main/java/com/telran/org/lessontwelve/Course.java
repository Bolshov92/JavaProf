package com.telran.org.lessontwelve;

public class Course {

    private String name;
    private int hours;

    public Course(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }
}
