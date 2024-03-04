package com.prof.homework.thread;

import lombok.AllArgsConstructor;

public class Notify {


    public static void main(String[] args) {
        Storage storage = new Storage();

        Producer producer = new Producer(storage);
        Consumer consumer = new Consumer(storage);
        NewItem newItem = new NewItem(storage);


        Thread prodThread = new Thread(producer);
        Thread consThread = new Thread(consumer);
        Thread item = new Thread(newItem);

        prodThread.start();
        consThread.start();
        item.start();
    }
}

class Storage {
    private final Object LOCK = new Object();
    private int item = 0;
    private int newItem  = 0;

    public void getItem() {
        synchronized (LOCK) {
            while (item < 1) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            item--;
            System.out.println("Customer has bought one item. Quantity: " + item);
            LOCK.notify();
        }
    }

    public void putItem() {
        synchronized (LOCK) {
            while (item >= 5) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            item++;
            System.out.println("Factory put one item into the Storage. Quantity: " + item);
            LOCK.notify();
        }
    }

    public void newItem() throws InterruptedException {
        synchronized (LOCK) {
            while (item >= 5  || newItem < 1 ) {
                LOCK.wait();
            }
            item--;
            newItem --;
            System.out.println("UpDate Items into Storage . Quantity:" + item);
            LOCK.notifyAll();
        }
    }
}


class Producer implements Runnable {
    Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            storage.putItem();
        }
    }
}

class Consumer implements Runnable {
    Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            storage.getItem();
        }
    }
}

@AllArgsConstructor
class NewItem implements  Runnable{
   Storage storage;


    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                storage.newItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
