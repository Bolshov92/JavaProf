package com.prof.homework.opp.order_management;

public class Customer {
    private String name;
    private String email;
    private Order[] orderHistory;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orderHistory = new Order[0];
    }

    public void makeOrder(Order order) {
        Order[] newOrderHistory = new Order[orderHistory.length + 1];
        for (int i = 0; i < orderHistory.length; i++) {
            newOrderHistory[i] = orderHistory[i];
        }
        newOrderHistory[orderHistory.length] = order;
        orderHistory = newOrderHistory;
        System.out.println("Order created " + this.name);
        System.out.println("Order info : " + order.getOrderDetails());

    }
}
