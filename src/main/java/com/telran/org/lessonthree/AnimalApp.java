package com.telran.org.lessonthree;

public class AnimalApp {
    public static void main(String[] args) {

        Whale whale = new Whale("Whale");


        Elephant elephant = new Elephant("Slon");


        System.out.println("I am whale , my name is : " + whale.getName());
        System.out.println("I am elephant, my name is : " + elephant.getName());

      Bird bird = new Bird();
      Flyable[] flyables = {bird, whale};

      for(Flyable flyable : flyables){
          flyable.fly();
      }


        Eatable[] eatables = {bird, whale};
      for(Eatable eatable :eatables){
          if(eatable.canEat()){
              System.out.println("Eat me");
          }
      }
    }
}
