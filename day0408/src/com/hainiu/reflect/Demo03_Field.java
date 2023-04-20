package com.hainiu.reflect;

import java.lang.reflect.Field;

public class Demo03_Field {
    public static void main(String[] args) throws Exception {
        //获取字节码文件
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.reflect.Student");

        //获取对象
        Student student = clazz.getConstructor().newInstance();

        //获取name属性
        Field nameField = clazz.getDeclaredField("name");
        //暴力反射
        nameField.setAccessible(true);
        nameField.set(student,"Tom");
        Object name = nameField.get(student);
        System.out.println(name);

        //获取age属性
        Field ageField = clazz.getDeclaredField("age");
        //暴力反射
        ageField.setAccessible(true);
        ageField.set(student,22);
        Object age = ageField.get(student);
        System.out.println(age);

        System.out.println(student);

    }
}
