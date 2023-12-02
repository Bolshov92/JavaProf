package com.prof.homework.opp.order_management;

public class APP {
    public static void main(String[] args) {
        Customer customerOne = new Customer("Alex","alex@gmail.com");
        Product productOne = new Product("Glass", 20, 20);
        Product productTwo = new Product("Window", 140, 10);
        OrderManager orderManager = new OrderManager(new Product[]{productTwo, productOne});
        Order order = new Order();

        customerOne.makeOrder(order);

        order.addProduct(productOne,2);
        order.addProduct(productTwo,1);
        order.getOrderDetails();

        orderManager.processNewOrder(order);

        System.out.println("Total cost : " + order.calculateTotalAmount() + order.getStatus());

    }
}
