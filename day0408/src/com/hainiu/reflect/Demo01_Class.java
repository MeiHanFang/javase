package com.hainiu.reflect;

public class Demo01_Class {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class类的静态方法
        Class<Student> clazz1 = (Class<Student>) Class.forName("com.hainiu.reflect.Student");
        System.out.println(clazz1);

        //类的class属性
        Class<Student> clazz2 = Student.class;
        System.out.println(clazz2);

        System.out.println(clazz1 == clazz2);

        //Object的getclass方法
        Student s = new Student();
        Class<Student> clazz3 = (Class<Student>) s.getClass();
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz3);

    }
}
