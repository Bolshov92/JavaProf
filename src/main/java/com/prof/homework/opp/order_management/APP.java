package com.prof.homework.opp.order_management;

public class APP {
    public static void main(String[] args) {
        String[] addBasket = {};
        Order orderOne = new Order(new String[0],"New Order", addBasket,20);
        orderOne.addProduct("Product 4");
    }
}
