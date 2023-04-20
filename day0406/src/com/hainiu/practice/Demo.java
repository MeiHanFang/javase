package com.hainiu.practice;

public class Demo {
    public static void main(String[] args) {
        //创建Runnable实现子类对象
        myTicket ticket = new myTicket();

        //创建Thread对象
        Thread t1 = new Thread(ticket,"窗口1");
        Thread t2 = new Thread(ticket,"窗口2");

        //开启线程
        t1.start();
        t2.start();
    }
}
