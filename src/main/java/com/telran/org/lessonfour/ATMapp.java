package com.telran.org.lessonfour;

public class ATMapp {

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard();
        creditCard.setCurrencyType(Currency.EUR);

        CreditCard creditCardTwo = new CreditCard();
        creditCardTwo.setCurrencyType(Currency.EUR);

        checkCurrency((creditCard));
        checkCurrency(creditCardTwo);

    }

    public static void checkCurrency(CreditCard creditCard) {
        if (Currency.EUR == creditCard.getCurrencyType()) {
            System.out.println("It is correct type");
        }
    }
}
