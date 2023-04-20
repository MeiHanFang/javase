package com.hianiu.io.objectstream;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    //transient 表示这个成员变量不想被序列化
    private transient String id;

    //序列化的版本号 修改类文件不影响反序列化
    private static final long serialVersionUID = 77L;

    public Student() {
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
