package com.hianiu.io.charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo03_BuferedReader {
    public static void main(String[] args) throws IOException {
        //字符缓存输入流
        BufferedReader br = new BufferedReader(new FileReader("day0409//a.txt"));

        //读一行 比普通字符输入流多一个方法
        String s;
        while ((s=br.readLine())!=null){
            System.out.println(s);
        }
    }
}
