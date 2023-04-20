package com.hainiu.practice.Test;

public class MathTeacher extends Teacher{
    public MathTeacher() {
    }

    public MathTeacher(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
    }

    @Override
    public void teach() {
        System.out.println("我是教数学的");
    }
}
