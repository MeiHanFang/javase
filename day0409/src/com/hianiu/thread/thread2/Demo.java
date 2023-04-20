package com.hianiu.thread.thread2;

public class Demo {
    public static void main(String[] args) {
        //创建MyRunnable对象    两个线程要淦的事是一样的 所以只用创建一次
        MyRunnable runnable = new MyRunnable();

        //创建线程
        Thread t1 = new Thread(runnable,"AG");
        Thread t2 = new Thread(runnable,"HERO");


        //开启线程
        t1.start();
        t2.start();

    }
}
