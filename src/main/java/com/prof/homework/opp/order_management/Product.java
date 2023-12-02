package com.prof.homework.opp.order_management;

public class Product {
    private String name;
    private int price;
    private int quantityInStock;

    public Product(String name, int price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

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

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public boolean checkAvailability(int quantity) {
        return quantity <= quantityInStock;
    }

    public void updateQuantity(int quantity) {
        quantityInStock -= quantity;
    }
}
