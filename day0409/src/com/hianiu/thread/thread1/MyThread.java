package com.hianiu.thread.thread1;

// 继承Thread
public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
           /* if (i == 20) {
                Thread.yield();
            }*/
            System.out.println(getName() + "：运行" + i);
        }
    }
}
