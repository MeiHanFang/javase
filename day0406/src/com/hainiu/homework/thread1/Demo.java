package com.hainiu.homework.thread1;

// Thread

public class Demo {
    public static void main(String[] args) {
        //创建线程
        MyThread t1 = new MyThread("hhh");

        MyThread t2 = new MyThread();
        //给t2线程取名字
        t2.setName("555");

        //开启线程
        t1.start();
        t2.start();

    }
}
