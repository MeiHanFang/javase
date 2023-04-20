package com.hainiu.reviewthread.thread1;

public class Test {
    //定义一个变量表示是否有汉堡包
    public static String hamburger = "";

    public static void main(String[] args) {
        //定义一个锁 保证是同一个锁
        Object lock = new Object();

        //创建线程并将锁传过去
        new Thread(new ProducerThread(lock),"肯德基").start();
        new Thread(new ConsumerThread(lock),"吃货").start();


    }
}
