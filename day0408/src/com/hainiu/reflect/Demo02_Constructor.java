package com.hainiu.reflect;

import java.lang.reflect.Constructor;

public class Demo02_Constructor {
    public static void main(String[] args) throws Exception {
        //获取字节码文件
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.reflect.Student");

        //通过字节码文件获取构造器
        //获取公共构造器中的一个
        Constructor<Student> constructor = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Student s1 = constructor.newInstance("Tom", 22);
        System.out.println(s1);

        //获取声明的构造器中的一个
        Constructor<Student> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);
        //如果构造器不是公共的 设置访问权限为true 使它可访问 暴力反射
        declaredConstructor.setAccessible(true);
        Student s2 = declaredConstructor.newInstance("Jerry");
        System.out.println(s2);
    }
}
