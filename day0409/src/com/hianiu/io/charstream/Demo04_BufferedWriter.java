package com.hianiu.io.charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04_BufferedWriter {
    public static void main(String[] args) throws IOException {
        //字符缓存输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day0409//c.txt"));

        //写一个字符串
        bw.write("我们的明天");
        //写一个换行 比普通字符输出流多的方法 不分系统
        /*
        Windows \r\n
        linux   \n
        Mac     \r
         */
        bw.newLine();
        bw.write("哈哈哈哈哈");

//        bw.flush();
        //关流
        bw.flush();
    }
}
