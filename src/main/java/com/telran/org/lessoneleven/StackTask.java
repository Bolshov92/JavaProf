package com.telran.org.lessoneleven;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class StackTask {

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b', 'a', 'c', 'a'};
        //ca

//        Stack<Character> stack = new Stack<>();
//        for (char element : chars) {
//            if (!stack.isEmpty() && stack.peek() == element) {        / short cod
//                stack.pop();
//                continue;
//            }
//            stack.push(element);
//        }
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (stack.isEmpty()) {
                stack.push(aChar);
                continue;
            }
            if (stack.peek() == aChar) {
                stack.pop();
            } else {
                stack.push(aChar);
            }
        }
        System.out.println(stack);
    }
}
