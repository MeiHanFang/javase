package com.hainiu.day07_practice.template;

//单例模式 只有一个对象

public class Singleton {
    private Singleton() {
    }

    private static final Singleton s = new Singleton();

    public static Singleton getSingleton() {
        return s;
    }
}
