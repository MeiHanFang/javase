package com.hianiu.thread.thread1;

public class Demo {
    public static void main(String[] args) {
        //创建线程
        MyThread myThread1 = new MyThread("加油鸭");
        MyThread myThread2 = new MyThread("要开心");

        /*//设置线程优先级
        myThread1.setPriority(1);
        myThread2.setPriority(10);*/

        //守护线程
        myThread2.setDaemon(true);

        //开启线程
        myThread1.start();
        myThread2.start();
    }
}
