package com.hainiu.day07_practice.exercise;

public class BasketballPlayer extends Player {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int year, int level) {
        super(name, year, level);
    }

    @Override
    public void exercise() {
        System.out.println("篮球运动员训练打篮球");
    }
}
