package com.prof.homework.Stack_Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public interface Stack2023<T> {
    void put(T t); //put
    boolean isEmpty(); //
    T get(T t);
}

class StackImpl<T> implements Stack2023<T> {
    ArrayList<T> stack = new ArrayList<>();

    @Override
    public void put(T t) {
        stack.add(t);
    }

    @Override
    public boolean isEmpty() {
        if (!(stack.size() == 0)) {

            return false;
        }
        System.out.println("Stack is Empty : ");
        return true;
    }

    @Override
    public T get(T t) {
        return stack.get(stack.size() - 1);
    }

    public static String reverseString(Stack<String> stack) {
        StringBuilder sb = new StringBuilder();
        sb.append(stack.get(stack.size() - 1)).reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        System.out.println(reverseString(stack));
    }

}
