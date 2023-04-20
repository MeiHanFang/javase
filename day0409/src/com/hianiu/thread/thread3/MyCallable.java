package com.hianiu.thread.thread3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println(Thread.currentThread().getName() + "：正在累加" + i);
        }
        return sum;
    }
}
