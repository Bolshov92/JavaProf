package com.telran.org.lessonthree.party;

import java.util.ArrayList;

public class PartyApp {

    public static void main(String[] args) {
        Guest alex = new Man("Alex", 45);
        Guest oleg = new Man("Oleg", 30);
        Guest alla = new Woman("Alla", 20);
        Guest maria = new Woman("Maria", 30);
        Guest child = new Child("Maxim", "M", 10);
        Guest nik = new GrandFather("Nik", 99);

        Guest[] guests = {alex, oleg, alla, maria, child, nik};

        for (Guest guest : guests) {
            guest.printGreetings();
        }

        DrinkAlcohol[] drinker = new DrinkAlcohol[10];
        LikeDance[] dancer = new LikeDance[10];
        Sleep[] sleeper = new Sleep[10];

        sortGuests(guests, drinker, dancer, sleeper);

        for (DrinkAlcohol element : drinker) {
            if (element != null) {
                element.drink();
            }
        }

        for (LikeDance element : dancer) {
            if (element != null) {
                element.dance();
            }
        }

        for (Sleep element : sleeper) {
            if (element != null) {
                element.sleep();
            }
        }

    }

    private static void sortGuests(Guest[] guests, DrinkAlcohol[] drinker,
                                   LikeDance[] dancer, Sleep[] sleeper) {
        int daIndex = 0;
        int ldIndex = 0;
        int slIndex = 0;
        for (Guest guest : guests) {
            if (guest instanceof DrinkAlcohol) {
                drinker[daIndex++] = (DrinkAlcohol) guest;

            }
            if (guest instanceof LikeDance) {
                dancer[ldIndex++] = (LikeDance) guest;

            }
            if (guest instanceof Sleep) {
                sleeper[slIndex++] = (Sleep) guest;

            }
        }
    }
}



