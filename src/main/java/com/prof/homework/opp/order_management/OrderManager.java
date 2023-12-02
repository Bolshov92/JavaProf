package com.prof.homework.opp.order_management;

public class OrderManager {
    private Product[] availableProducts;
    private Order[] orders;

    public OrderManager(Product[] availableProducts) {
        this.availableProducts = availableProducts;
        this.orders = new Order[0];
    }

    public void processNewOrder(Order order) {
        Order[] newOrders = new Order[orders.length + 1];
        for (int i = 0; i < orders.length; i++) {
            newOrders[i] = orders[i];
        }
        newOrders[orders.length] = order;
        orders = newOrders;

        System.out.println("New order processed");
    }

    public void updateOrderStatus(Order order, String status) {
        order.setStatus(status);
        System.out.println("upDate order status");
    }
}
