package com.telran.org.lessonsix;

public class CreditCard {
    int amount;
    String currency;

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public CreditCard(int amount) {
        this.amount = amount;
        this.currency = currency;
    }
}