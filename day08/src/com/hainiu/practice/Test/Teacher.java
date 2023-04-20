package com.hainiu.practice.Test;

/*
1、定义一个教师Teacher类，该类为抽象的。
	其中有字段：姓名（name），年龄（age），联系方式（phoneNumber）
	编写无参和包含全部参数的构造方法
	其中字段需要符合封装的思想，提供相应的getter和setter
	定义一个抽象方法teach()
	定义一个实现的方法showInfo()，输出"我叫xxx，我的年龄是xxx，我的联系方式是xxx" （注意：其中的xxx为真实的字段值）

2、定义一个数学教师类MathTeacher，由Teacher类衍生出来。
	重写父类的抽象方法teach()，输出"我是教数学的"。

3、在测试类中，创建MathTeacher的对象进行测试，要求创建对象时，既可以使用空参构造，也可以使用带参构造；
	并且 teach方法和showInfo方法都能按照格式打印输出。
 */

import java.util.Objects;

public abstract class Teacher {
    private String name;
    private int age;
    private String phoneNumber;

    public Teacher() {
    }

    public Teacher(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void teach();

    public void showInfo(String name,int age,String phoneNumber){
        System.out.println("我叫"+this.name+"，我的年龄是"+this.age+"，我的联系方式是"+this.phoneNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age &&
                Objects.equals(name, teacher.name) &&
                Objects.equals(phoneNumber, teacher.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phoneNumber);
    }
}
