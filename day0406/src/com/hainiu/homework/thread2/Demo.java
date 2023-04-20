package com.hainiu.homework.thread2;

//Runnable

public class Demo {
    public static void main(String[] args) {
        //创建Runnable实现子类对象
        MyRunnable r = new MyRunnable();

        //创建线程
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r, "555");

        t1.setName("hhh");

        //开启线程
        t1.start();
        t2.start();


    }
}
