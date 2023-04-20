package com.hianiu.io.charstream;

//字符流

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo01_FileReader {
    public static void main(String[] args) throws IOException {
        //读数据
        FileReader fr = new FileReader("day0409//a.txt");
        //字节输入流读取会出现乱码
//        FileInputStream fis = new FileInputStream("day0409//a.txt");

        //一个字符一个字符的读
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }

     /*   //一个字符数组一个字符数组的读
        char[] charArr = new char[8192];
        int len;
        while ((len = fw.read(charArr)) != -1) {
            System.out.println(new String(charArr, 0, len));
        }*/

        //关流
        fr.close();

    }
}
