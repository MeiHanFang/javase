package com.hianiu.thread.thread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建MyCallable对象
        MyCallable myCallable = new MyCallable();

        //可以作为线程构造器的参数
        //可以接收线程的返回值
        FutureTask<Integer> f1 = new FutureTask<>(myCallable);
        FutureTask<Integer> f2 = new FutureTask<>(myCallable);

        //创建线程
        Thread t1 = new Thread(f1,"一诺");
        Thread t2 = new Thread(f2,"暖阳");

        //开启线程
        t1.start();

        //插队
//        t1.join();


        t2.start();

        //接收结果并打印
        Integer result1 = f1.get();
        System.out.println(result1);
        Integer result2 = f2.get();
        System.out.println(result2);


    }
}
