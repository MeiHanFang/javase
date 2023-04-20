package com.hainiu.day07_practice.exercise;

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int year) {
        super(name, year);
    }

    //训练
    public abstract void training();
}
