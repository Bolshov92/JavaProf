package com.prof.homework.opp.order_management;

public class Product {
    private String name;
    private int price;
    private int balanceInStock;
    private int upDateStock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBalanceInStock() {
        return balanceInStock;
    }

    public void setBalanceInStock(int balanceInStock) {
        this.balanceInStock = balanceInStock;
    }

    public int getUpDateStock() {
        return upDateStock;
    }

    public void setUpDateStock(int upDateStock) {
        this.upDateStock = upDateStock;
    }

    public Product(String name, int price, int balanceInStock) {
        this.name = name;
        this.price = price;
        this.balanceInStock = balanceInStock;
    }

    public boolean checkStock(){
        if(balanceInStock != 0){
            System.out.println(" Product in Stock ");
        }
        System.out.println("Product out of Stock");
        return false;
    }

    public void upDateInStock(){
        if(upDateStock != balanceInStock){
            balanceInStock = upDateStock;
            System.out.println(upDateStock);
        }
    }
}
