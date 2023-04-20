package com.hainiu.reviewthread;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //增
        list.add("你好");
        list.add("hello");
        list.add("鹿晗");

        //删
        list.remove(0);

        //改
        list.set(0,"你好");

        //查
        String s1 = list.get(1);
        System.out.println(s1);

        for (String s : list) {
            System.out.println(s);
        }


    }
}
