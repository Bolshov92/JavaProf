package com.prof.homework._2024_02_26;

/**
 * class Thread
 * interface Runnable
 * interface Callable
 */
public class MT1 {
    public static void main(String[] args) {
        System.out.println("MAIN START");

        TH1 Th1 = new TH1();
        TH2 Th2 = new TH2();

        Th1.start();
        Th2.start();

        System.out.println("MAIN END");
    }
}

class TH1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("-TH1-> " + i);
        }
    }
}

class TH2 extends Thread {
    @Override
    public void run() {
        for (int i = 50; i > 0; i--) {
            System.out.println("-TH2-> " + i);
        }
    }
}