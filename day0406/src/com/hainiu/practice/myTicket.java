package com.hainiu.practice;


import java.util.concurrent.locks.ReentrantLock;

public class myTicket implements Runnable {
    //票
    private int ticket = 100;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {

            try {
                lock.lock();
                if (ticket <= 0) {
                    //票卖完了 退出
                    break;
                }
                //模拟出票时间
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //卖出一张
                System.out.println(Thread.currentThread().getName()+"：第" + ticket-- + "张票正在售出");
            }finally {
                lock.unlock();
            }



        }
    }
}
