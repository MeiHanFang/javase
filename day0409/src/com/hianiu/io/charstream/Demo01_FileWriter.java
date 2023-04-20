package com.hianiu.io.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01_FileWriter {
    public static void main(String[] args) throws IOException {
        //字符输出流
        FileWriter fw = new FileWriter("day0409//b.txt");

        //写
        //字节
        fw.write('c');
        fw.write('中');
        //字符串
        fw.write("我爱学习");
        //字符串的一部分
        fw.write("哈哈哈哈哈", 0, 3);
        //换行
        fw.write("\r\n");
        //字符数组
        fw.write(new char[]{'鹿', '晗'});
        //字符数组的一部分
        fw.write(new char[]{'宇', '宙', '第', '一', '帅'},2,3);

        //字符流自带缓冲区 如果不冲洗就会留在缓冲区 进不到文件
        fw.flush();

        //close方法自带flush方法
        fw.close();
    }
}
