package com.hainiu.day07_practice.template;

//模板模式 计算一段代码的运行时间

public abstract class TimeTemplate {

    public final long timeTemplate() {
        //开始时间
        long start = System.currentTimeMillis();

        //代码
        code();

        //结束时间
        long end = System.currentTimeMillis();

        //运行时间
        return end - start;
    }

    abstract void code();
}
