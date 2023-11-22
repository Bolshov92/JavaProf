package com.telran.org.lessonone;

public class Dog {

   private String breed;
   private int age;
    private String color;

    public Dog() {
        System.out.println("Hello");
    }
    public Dog(String breed, String color) {
     this.breed = breed;
     this.color = color;

    }

    public Dog(String breed, String color, int age){
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <0){
            return;
        }
        this.age = age;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

