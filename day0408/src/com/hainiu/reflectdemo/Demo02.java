package com.hainiu.reflectdemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author HaiNiu
 * @description 往泛型声明为String的list集合中添加一个Integer数据
 */
public class Demo02 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        ArrayList<String> list = new ArrayList<String>();

        list.add("100");

        // 反射获取ArrayList类的字节码对象
        Class<ArrayList> clazz = (Class<ArrayList>) list.getClass();

        // 获取add方法
        Method addMethod = clazz.getMethod("add", Object.class);

        // 执行
        addMethod.invoke(list, 100);

//        System.out.println(list);

        for (Object s : list) {
            System.out.println(s);
        }
    }
}
