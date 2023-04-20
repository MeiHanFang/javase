package com.hainiu.practice.oop2;

public class Test {
    public static void main(String[] args) {
        useFlyable((String s) -> {
            System.out.println(s+"，起飞！");
        });
    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里");
    }
}
