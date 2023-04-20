package com.hainiu.practice.oop1;

public class Test {
    public static void main(String[] args) {
        useEatable(() -> {
            System.out.println("吃橙子");
        });
    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}
