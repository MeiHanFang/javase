package com.hainiu.file;

import org.omg.CORBA.ARG_OUT;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
        File f1 = new File("day0405//aaa");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        System.out.println("-------");

        File f2 = new File("day0405//a.txt");
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f2.exists());

        System.out.println("-------");

        String s1 = f1.getAbsolutePath();
        System.out.println(s1);

        String s2 = f1.getPath();
        System.out.println(s2);

        System.out.println(f1.getName());
        System.out.println(f2.getName());

        System.out.println("-------");

        File f3 = new File("C:\\Users\\Seven\\Desktop\\梅寒芳-链表");
        File[] files = f3.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
