package com.hainiu.day07_practice.graph;

/*
接口练习（图形接口）
 */

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(1.7);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(2,7);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }

}
