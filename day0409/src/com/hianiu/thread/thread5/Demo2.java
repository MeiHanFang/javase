package com.hianiu.thread.thread5;

//掌握阻塞队列的使用 实现生产者消费者模式

import java.util.concurrent.ArrayBlockingQueue;

public class Demo2 {
    public static void main(String[] args) {
        //创建阻塞队列
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        int i = queue.remainingCapacity();
        System.out.println(i);

        //创建生产者线程
        new Thread(() -> {
            //不停的生产
            while (true) {
                //生产一碗
                if (queue.size() != queue.remainingCapacity()){
                    try {
                        queue.put("螺蛳粉");
                        System.out.println("生产者煮了一碗螺蛳粉，目前有" + queue.size() + "碗");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        }).start();

        //创建x消费者线程
        new Thread(() -> {
            //不停的吃
            while (true) {
                if (queue.size() != 0){
                    //吃一碗
                    try {
                        String s = queue.take();
                        System.out.println("消费者吃了一碗" + s + "，目前有" + queue.size() + "碗");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
