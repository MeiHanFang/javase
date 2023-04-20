package com.hianiu.thread.thread6;

//线程池

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        //创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy()
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        //为线程池提交任务
        for (int i = 0; i < 20; i++) {
            pool.submit(() ->
                    System.out.println(Thread.currentThread().getName() + "正在执行")
            );
        }

    }
}
