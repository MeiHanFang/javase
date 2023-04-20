package com.hainiu.day07_practice.exercise;

public abstract class Player extends Person {
    private int level;

    public Player() {
    }

    public Player(String name, int year, int level) {
        super(name, year);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //运动
    public abstract void exercise();
}
