package com.hianiu.thread.thread4;

/*
多条线程操作共享资源，并且对共享资源作出修改。
    解决方案：
        synchronized
        Lock接口 互斥锁
 */

public class Demo {
    public static void main(String[] args) {
        //创建MyTicket对象
        MyTicket ticket = new MyTicket();
        MyTicket2 ticket2 = new MyTicket2();

        //创建线程
        Thread t1 = new Thread(ticket2,"窗口一");
        Thread t2 = new Thread(ticket2,"窗口二");

        //开启线程
        t1.start();
        t2.start();
    }
}
