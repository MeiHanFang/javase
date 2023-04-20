package com.hainiu.reviewthread.thread1;

public class ConsumerThread implements Runnable{
    //锁
    private Object lock;

    public ConsumerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            //不停的生产
            while (true) {
                if (Test.hamburger == "") {
                    //没有汉堡包 吃不了 锁等待
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //吃一个
                Test.hamburger = "";
                System.out.println(Thread.currentThread().getName() + "吃了一个汉堡包");

                //唤醒生产者
                lock.notifyAll();
            }
        }

    }
}
