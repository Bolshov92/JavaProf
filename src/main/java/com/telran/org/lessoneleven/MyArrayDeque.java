package com.telran.org.lessoneleven;

public class MyArrayDeque implements MyDeque{

    private static  final int DEFAULT_CAPACITY = 10;
    private Integer[] elements;
    private int headIndex;
    private int tailIndex;
    private int countOfElements;

    public MyArrayDeque(){
        elements = new Integer[DEFAULT_CAPACITY];

    }
    @Override
    public void addToHead(Integer element) {

    }

    @Override
    public void addToTail(Integer element) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Integer removeHead() {
        return null;
    }

    @Override
    public Integer removeTail() {
        return null;
    }

    @Override
    public Integer peekHead() {
        return null;
    }

    @Override
    public Integer peakTail() {
        return null;
    }

    private void grow(){
        //elements *1.5
    }
}
