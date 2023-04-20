package com.hainiu.homework.thread4;

import java.util.concurrent.locks.ReentrantLock;

public class MyTicket2 implements Runnable {
    //票
    private int ticket = 100;

    //互斥锁
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        //不停的卖票
        while (true) {
            lock.lock();
            try {
                //如果票卖完了 退出
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //卖出一张
                System.out.println(Thread.currentThread().getName() + "正在售卖第" + ticket-- + "张票");
            } finally {
                lock.unlock();
            }

        }
    }
}
