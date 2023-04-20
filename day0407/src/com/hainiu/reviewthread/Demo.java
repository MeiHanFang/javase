package com.hainiu.reviewthread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,
                7,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy()
                );
        for (int i = 0; i < 13; i++) {
            pool.submit(()-> System.out.println(Thread.currentThread().getName()+"正在执行"));

        }
    }
}
