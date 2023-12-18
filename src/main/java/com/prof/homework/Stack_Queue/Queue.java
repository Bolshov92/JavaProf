package com.prof.homework.Stack_Queue;

import java.util.ArrayList;
import java.util.List;

public interface Queue<E> {

    boolean add(E e);

    void remove();

    E element();
}

class QueueImpl<E> implements Queue<E> {
    List<E> queue = new ArrayList<>();

    @Override
    public boolean add(E e) {
        if (queue.contains(e)) {
            System.out.println("is Already in list");
            return false;
        } else {
            queue.add(e);
        }
        return true;
    }

    @Override
    public void remove() {
        if (queue.isEmpty()) {
            System.out.println("No Such Element Exception");
        } else {
            queue.get(0);
            queue.remove(0);
        }
    }

    @Override
    public E element() {
        if (queue.isEmpty()) {
            System.out.println("No Such Element Exception");
        }
        return queue.get(0);
    }

    public static void printInReverse(Queue<String> queue){
//        for(String str : queue){
//
//        }
    }
}


