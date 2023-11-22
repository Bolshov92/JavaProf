package com.telran.org.lessoneight;

import java.util.LinkedList;
import java.util.List;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        packOperationTwo(list);
      packOperationOne(list);
    }

    private static void packOperationTwo(MyLinkedList list){
      list.pushToTail(10);

    }

    private static void packOperationOne(MyLinkedList list){
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(8);

        // 8 -> 3-> 4 -> 2
        list.print();
        list.pushToTail(15);
        list.print();
    }
}
