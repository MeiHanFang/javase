package com.hainiu.homework.thread6;

/*
掌握线程池的标准创建方式
    public ThreadPoolExecutor(int corePoolSize,						// 核心线程数量
                              int maximumPoolSize,					// 最大线程数量
                              long keepAliveTime,					// 空闲线程存活时间（值）
                              TimeUnit unit,						// 空闲线程存活时间（单位）
                              BlockingQueue<Runnable> workQueue,	// 阻塞队列
                              ThreadFactory threadFactory,			// 新线程的创建工厂（产生方式）
                              RejectedExecutionHandler handler)		// 拒绝策略
 */

import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,
                7,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy()
                );

        for (int i = 0; i < 30; i++) {
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()+"执行");
            });
        }




    }
}
