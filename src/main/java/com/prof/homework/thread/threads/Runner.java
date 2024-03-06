package com.prof.homework.thread.threads;

import static java.lang.System.out;
import static java.lang.Thread.currentThread;
import static java.util.stream.IntStream.range;

public final class Runner {
    private static final int CREATED_THREADS_AMOUNT = 10;
    public static void main(final String... args) {
//        System.out.println(currentThread().getName());
//
//        final Thread thread = new Thread(){
//            @Override
//            public void run() {
//                System.out.println(currentThread().getName());
//            }
//        };
//        thread.start();
//        final Runnable task = ()-> out.println(currentThread().getName());
//        final Thread thread = new Thread(task);
//        thread.start();
        final Runnable taskDisplayingThreadName = ()-> out.println(currentThread().getName());
        final Runnable taskCreatingThreads = () ->
                range(0,CREATED_THREADS_AMOUNT)
                        .forEach(i->startThread(taskDisplayingThreadName));
        startThread(taskCreatingThreads);
    }

    private static void startThread(final Runnable runnable){
        final Thread thread = new Thread(runnable);
        thread.start();
    }
}
