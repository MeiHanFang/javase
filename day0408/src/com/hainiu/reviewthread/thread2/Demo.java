package com.hainiu.reviewthread.thread2;

//用阻塞队列实现消费者和生产者模式

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        //创建一个阻塞队列 容量设置为1
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        //生产者线程 lamda表达式
        new Thread(() -> {
            //不断的生产
            while (true) {
                try {
                    queue.put("螺蛳粉");
                    System.out.println(Thread.currentThread().getName() + "生产了一碗螺蛳粉，目前有" + queue.size() + "个");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //消费者线程
        new Thread(() -> {
            //不断的吃
            while (true) {
                try {
                    String s = queue.take();
                    System.out.println(Thread.currentThread().getName() + "吃了一碗"+s+"，目前有" + queue.size() + "个");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
