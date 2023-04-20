package com.hainiu.homework.thread4;

/*
5、（重点）能够分析出什么时候需要线程的同步控制。
    多条线程操作共享资源，并且对共享资源作出修改。
    解决方案：
        synchronized
        Lock接口 互斥锁
    注意：多条线程使用的锁对象必须是同一个。
 */

public class Demo {
    public static void main(String[] args) {
        //创建实现了Runnable接口的子类对象
        MyTicket2 r = new MyTicket2();

        //创建线程
        Thread t1 = new Thread(r,"窗口1");
        Thread t2 = new Thread(r,"窗口2");

        //开启线程
        t1.start();
        t2.start();

    }
}
