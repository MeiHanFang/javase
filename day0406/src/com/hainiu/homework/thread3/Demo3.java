package com.hainiu.homework.thread3;

//Callable

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建MyCallable对象
        MyCallable c = new MyCallable();

        //FutureTask对象实现了Runnable接口 可以作为Thread的参数
        //FutureTask对象还可以接收线程执行的结果
        FutureTask task1 = new FutureTask(c);
        FutureTask task2 = new FutureTask(c);

        //创建线程
        Thread t1 = new Thread(task1,"hhh");
        Thread t2 = new Thread(task2,"555");

        t1.start();
        t2.start();

        //获取结果并输出 阻塞式方法 等待线程执行完毕才获取结果
        System.out.println(task1.get());
        System.out.println(task2.get());

    }

}
