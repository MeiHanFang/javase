package com.hainiu.reviewthread.thread1;

public class ProducerThread implements Runnable {
    //锁
    private Object lock;

    public ProducerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            //不停的生产
            while (true) {
                if (Test.hamburger != "") {
                    //有汉堡包 不生产 锁等待
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //生产一个
                Test.hamburger = "汉堡包";
                System.out.println(Thread.currentThread().getName() + "生产了一个" + Test.hamburger);

                //唤醒消费者
                lock.notifyAll();
            }
        }

    }
}
