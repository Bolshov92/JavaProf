package com.prof.homework._2024_02_12.dryKissYagni;

import java.util.List;

public class Order {
    private List<Item> items;

    public void addItem(Item item) {
        // Добавление товара
        items.add(item);

    }

    public void calculateTotal() {
        // Вычисление общей стоимости заказа
        items.stream()
                .map(Item::getPrice)
                .reduce(0.0, Double::sum);
    }

    public void printInvoice() {
        // Печать счета
        items.stream()
                .forEach(item-> System.out.println("Item - " + item.getName() + " | Price : "+ item.getPrice()));
    }
    class Item{
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
