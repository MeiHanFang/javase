package com.hainiu.day07_practice.exercise;

public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int year) {
        super(name, year);
    }

    @Override
    public void training() {
        System.out.println("乒乓球教练指导如何打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练学习说英语");
    }
}
