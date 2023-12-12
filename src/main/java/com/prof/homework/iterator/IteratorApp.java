package com.prof.homework.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorApp {

    public static void main(String[] args) {
        String text = "text";
        String str = "level";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String string) {
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            characterList.add(string.charAt(i));
        }
        ListIterator<Character> iterator1 = characterList.listIterator(characterList.size());
        Iterator<Character> iterator2 = characterList.listIterator();
        int count = 0;
        boolean temp = true;
        while (iterator2.hasNext() && iterator1.hasPrevious() && count != characterList.size() / 2) {
            count++;
            if (!iterator2.next().equals(iterator1.previous())) {
                temp = false;
                break;
            }
        }
        return temp;
    }
}

