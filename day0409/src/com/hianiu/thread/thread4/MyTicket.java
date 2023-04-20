package com.hianiu.thread.thread4;

//用synchronized关键字

public class MyTicket implements Runnable {
    //票
    private int ticket = 100;

    @Override
    public void run() {
        //不停的卖票
        while (true) {
            synchronized (this){
                if (ticket <= 0) {
                    //票买完了
                    break;
                }
                //卖出一张
                System.out.println(Thread.currentThread().getName() + "正在售卖第" + ticket-- + "张票");
            }
        }

    }
}
