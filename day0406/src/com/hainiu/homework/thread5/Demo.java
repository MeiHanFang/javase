package com.hainiu.homework.thread5;

//掌握阻塞队列的使用 实现生产者消费者模式

import java.util.concurrent.LinkedBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        //创建阻塞队列实现等待唤醒机制
        LinkedBlockingQueue<String> link = new LinkedBlockingQueue<>(1);

        //一个线程不断的存
        new Thread(() -> {
            while (true) {
                try {
                    link.put("螺蛳粉");
                    System.out.println(Thread.currentThread().getName() + "正在煮螺蛳粉，目前有" + link.size() + "碗");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //一个线程不断的取
        new Thread(() -> {
            while (true) {
                try {
                    String s = link.take();
                    System.out.println(Thread.currentThread().getName() + "正在吃"+s+"，目前有" + link.size() + "碗");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
