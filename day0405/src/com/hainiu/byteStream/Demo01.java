package com.hainiu.byteStream;

/*
掌握使用字节流拷贝文件
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {
        try (//字节输入流读取数据
             FileInputStream fis = new FileInputStream("D:\\壁纸\\QQ图片20220409115210.jpg");
             //字节输出流存数据
             FileOutputStream fos = new FileOutputStream("day0405//hh.jpg");){
            //拷贝文件
            byte[] buffer = new byte[8192];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
