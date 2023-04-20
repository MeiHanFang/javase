package com.hainiu.io;

//使用字节流拷贝文件

import java.io.*;

public class Demo {
    public static void main(String[] args)  {
        try (//带有缓冲区的字节输入流 读取文件
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\hainiu_study\\class\\17 IO流\\字节流体系.png"));
             //带有缓冲区的字节输出流 写入文件
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day0408\\byteStream.png"));
             ){
            //字节数组
            byte[] bytes = new byte[8192];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
