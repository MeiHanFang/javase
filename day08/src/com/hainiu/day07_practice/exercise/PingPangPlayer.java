package com.hainiu.day07_practice.exercise;

public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int year, int level) {
        super(name, year, level);
    }

    @Override
    public void exercise() {
        System.out.println("乒乓球远动员训练打乒乓");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员学习说英语");
    }
}
