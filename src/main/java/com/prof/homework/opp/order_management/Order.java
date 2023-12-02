package com.prof.homework.opp.order_management;

import java.util.Arrays;

public class Order {
    private Product[] products;
    private String status;
    private double totalAmount;

    public Order() {
        this.products = new Product[0];
        this.status = "Pending";
        this.totalAmount = 0.0;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void addProduct(Product product, int quantity) {
        if (product.checkAvailability(quantity)) {
            Product[] newProducts = new Product[products.length + 1];
            System.arraycopy(products, 0, newProducts, 0, products.length);
            newProducts[products.length] = product;
            products = newProducts;

            totalAmount += product.getPrice() * quantity;
            product.updateQuantity(quantity);
        } else {
            System.out.println("Not enough goods in stock");
        }
    }

    public double calculateTotalAmount() {
        return totalAmount;
    }
    public String getOrderDetails() {
        String details = "Order status : " + status + "\n" +
                "Total amount : " + totalAmount + "\n" +
                "Item order:\n";

        for (Product product : products) {
            details += product.getName() + " - " + product.getPrice() + "\n";
        }

        return details;
    }

}
