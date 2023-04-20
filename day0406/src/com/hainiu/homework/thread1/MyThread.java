package com.hainiu.homework.thread1;

public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + ":hello MyThread" + i);
        }
    }
}
