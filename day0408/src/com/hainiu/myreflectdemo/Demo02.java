package com.hainiu.myreflectdemo;

/*
往泛型声明为String的list集合中添加一个Integer数据
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合
        ArrayList<String> list = new ArrayList<>();

        list.add("123");

        //获取字节码文件
        Class<ArrayList> clazz = (Class<ArrayList>) list.getClass();

        //获取add方法
        Method addMethod = clazz.getMethod("add", Object.class);

        //用这个方法存Integer数据
        addMethod.invoke(list,777);

        System.out.println(list);


    }
}
