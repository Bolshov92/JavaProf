package com.prof.homework.thread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DTex {
    public static void main(String[] args) throws IOException {
        System.out.println("MAIN START");
        UserThread userThread = new UserThread();
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        System.out.println("MAIN END");
    }
}

class UserThread extends Thread {

    @Override
    public void run() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file1.txt"))) {
            for (char c = '!'; c < 'z'; c++) {
                bufferedWriter.write(c);
            }
        } catch (RuntimeException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}


class DaemonThread extends Thread {

    @Override
    public void run() {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter  bufferedWriter1= new BufferedWriter(new FileWriter("file2.txt"));

            for (int i = 0; i < 999; i++) {
                bufferedWriter1.write(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


