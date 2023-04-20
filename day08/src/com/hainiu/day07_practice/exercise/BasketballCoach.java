package com.hainiu.day07_practice.exercise;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int year) {
        super(name, year);
    }

    @Override
    public void training() {
        System.out.println("篮球教练训练如何打篮球");
    }
}
