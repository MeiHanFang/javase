package com.hainiu.file;

//File类创建功能

import java.io.File;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
    /*    File f1 = new File("day0405//b.txt");
        System.out.println(f1.createNewFile());*/

//        File f2 = new File("day0405//aaa//bbb//ccc//ddd//www");
//        System.out.println(f2.mkdirs());
/*
        File f3 = new File("day0405//b.txt");
        System.out.println(f3.delete());*/

        // 可以删除文件和文件夹 文件夹只能删除空文件夹
        File f4 = new File("day0405//aaa//bbb//ccc");
        System.out.println(f4.delete());
    }
}
