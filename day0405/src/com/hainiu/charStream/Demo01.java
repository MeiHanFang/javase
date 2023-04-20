package com.hainiu.charStream;

/*
掌握缓冲字符流读取一行数据的方法
掌握缓冲字符流写出字符串和换行符的方法
 */

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //读
        BufferedReader br = new BufferedReader(new FileReader("day0405//a.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();

        //写
        BufferedWriter bw = new BufferedWriter(new FileWriter("day0405//aa.txt"));

        bw.write("鹿晗");
        bw.newLine();
        bw.write("宇宙第一帅");
        bw.newLine();

        bw.close();
    }
}
