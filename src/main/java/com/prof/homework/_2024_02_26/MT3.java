package com.prof.homework._2024_02_26;

public class MT3 {
    public static void main(String[] args) {
        new Thread(()-> {
            for (int i = 0; i < 50; i++) {
                System.out.println("-TH1-> " + i);
            }
        }).start();
    }
}
