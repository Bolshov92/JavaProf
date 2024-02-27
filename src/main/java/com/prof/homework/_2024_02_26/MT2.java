package com.prof.homework._2024_02_26;

public class MT2 {
    public static void main(String[] args) {
        System.out.println("MAIN START");
        Thread T1 = new Thread(new RI1());
        Thread T2 = new Thread(new RI2());

        T1.start();
        T2.start();
        System.out.println("MAIN END");
    }
}

class RI1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("-TH1-> " + i);
        }
    }
}

class RI2 implements Runnable {

    @Override
    public void run() {
        for (int i = 50; i > 0; i--) {
            System.out.println("-TH2-> " + i);
        }
    }
}
