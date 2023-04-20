package com.hainiu.day07_practice.animal;

/*
1抽象类练习（动物） oop3包    abstract
定义猫类(Cat)和狗类(Dog)
​	猫类成员方法：eat（猫吃鱼）drink（喝水…）
​	狗类成员方法：eat（狗吃肉）drink（喝水…）
 */

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("馒头");
        dog.setColor("白色");
        System.out.println("name:" + dog.getName() + " color:" + dog.getColor());
        dog.drink();
        dog.eat();

        System.out.println("=====");

        Cat cat = new Cat("大黄","黄色");
        System.out.println("name:" + cat.getName() + " color:" + cat.getColor());
        cat.drink();
        cat.eat();
    }
}
