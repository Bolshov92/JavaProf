package com.prof.homework.opp.order_management;

import java.util.Arrays;

public class Order {

    private String[]listProducts;
    private String orderStatus;
    private int totalAmount;
    private String [] basket;

    public String[] getListProducts() {
        return listProducts;
    }

    public void setListProducts(String[] listProducts) {
        this.listProducts = listProducts;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String[] getBasket() {
        return basket;
    }

    public void setBasket(String[] basket) {
        this.basket = basket;
    }

    public Order(String[] listProducts, String orderStatus, String[] basket, int totalAmount) {
        this.listProducts = listProducts;
        this.orderStatus = orderStatus;
        this.totalAmount = totalAmount;
        this.basket = basket;
    }

    public void addProduct(String product){
       if(basket == null){
           basket = new String[0];
       }
        String[] newBasket = new String[basket.length + 1];
        for (int i = 0; i < basket.length; i++) {
            newBasket[i] = basket[i];
        }
        newBasket[basket.length] = product;
        basket = newBasket;
        totalAmount = calculateTotalAmount();
        System.out.println("Total Amount : " + calculateTotalAmount()+ " $ ");
        for (String product1 : basket) {
            System.out.println(product1);
        }
    }
    private int calculateTotalAmount(){
        if(basket == null){
            return 0;
        }
        return totalAmount;
    }
}
