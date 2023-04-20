package com.hianiu.thread.thread4;

import java.util.concurrent.locks.ReentrantLock;

public class MyTicket2 implements Runnable {
    //票
    private int ticket = 100;
    //ReentrantLock锁
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        //不停的卖票
        while (true) {

            //上锁
            lock.lock();
            try {
                if (ticket <= 0) {
                    //票买完了
                    break;
                }
                //卖出一张
                System.out.println(Thread.currentThread().getName() + "正在售卖第" + ticket-- + "张票");
            }finally {
                //释放锁
                lock.unlock();
            }


        }

    }
}
