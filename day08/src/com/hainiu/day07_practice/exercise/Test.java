package com.hainiu.day07_practice.exercise;

/*
3面向对象综合练习
某个俱乐部有两种体育运动，乒乓球、篮球；
有相应的教练和运动员；
他们都要进行一些常规的训练操作；
与乒乓球相关的人员，由于外事活动的需要，需要学习英文。

请使用面向对象相关知识描述上述场景。
 */

public class Test {
    public static void main(String[] args) {
        //乒乓球运动员
        PingPangPlayer ppp = new PingPangPlayer("Seven",5,1);
        System.out.println(ppp.getName());
        System.out.println(ppp.getYear());
        System.out.println(ppp.getLevel());
        ppp.sleep();
        ppp.exercise();

        System.out.println("=====");

        useCoach(new BasketballCoach());
    }

    //使用教练
    public static void useCoach(Coach coach){
        coach.training();
    }
}
