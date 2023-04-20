package com.hainiu.day07_practice.template;

public class TimeFor extends TimeTemplate {
    @Override
    void code() {
        long sum = 0;
        for (int i = 1; i <= 10000000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
