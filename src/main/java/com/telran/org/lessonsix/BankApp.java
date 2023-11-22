package com.telran.org.lessonsix;

import com.telran.org.lessonfour.CreditCard;

public class BankApp {


    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        CreditCard usd = new CreditCard();
        CreditCard creditCard1 = new CreditCard();
        checkCurrency(creditCard);
        checkCurrency(usd);
        checkCurrency(creditCard1);
    }

    private static void checkCurrency(CreditCard card) {
        if ("EUR".equals(card.getCurrency())) {
            System.out.println("It's ok");
        } else {
            System.out.println("Not ok");
        }
    }
}
