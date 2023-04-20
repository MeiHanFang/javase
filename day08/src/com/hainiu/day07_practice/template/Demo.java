package com.hainiu.day07_practice.template;

public class Demo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        System.out.println(s1);

        Singleton s2 = Singleton.getSingleton();
        System.out.println(s2);
    }
}
