package com.hainiu.file;

/*
掌握File类的常用API
练习时注意：测试文件夹，因为删除不走回收站。
 */

import org.omg.CORBA.ARG_OUT;

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        //三种构造方法
        File f1 = new File("day0405//a");
        System.out.println(f1);

        File f2 = new File("D:\\javaProjects\\javase\\day0405","a.txt");
        System.out.println(f2);

        File f3 = new File("D:\\javaProjects\\javase\\day0405");
        File f4 = new File(f3,"a.txt");
        System.out.println(f4);


    }
}
