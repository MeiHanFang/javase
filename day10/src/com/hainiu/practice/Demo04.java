package com.hainiu.practice;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        Student s1 = new Student();
        s1.setName(name);

        while (true){
            System.out.println("请输入年龄：");
            String ageStr = sc.nextLine();
            try {
                int age = Integer.parseInt(ageStr);
                s1.setAge(age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(s1);


    }
}
