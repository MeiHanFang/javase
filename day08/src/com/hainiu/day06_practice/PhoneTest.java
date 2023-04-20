package com.hainiu.day06_practice;

public class PhoneTest {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.setBrand("苹果");
        sp.setPrice(100086);
        sp.setSize(10.2);
        System.out.println(sp);

        SmartPhone sp2 = new SmartPhone("鸭子", 1234, 6.7);
        System.out.println(sp2);
    }
}
