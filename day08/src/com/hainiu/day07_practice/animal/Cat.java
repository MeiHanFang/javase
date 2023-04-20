package com.hainiu.day07_practice.animal;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }
}
