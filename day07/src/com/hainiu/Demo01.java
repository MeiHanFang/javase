package com.hainiu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {
        try (//输入流
             FileInputStream fis = new FileInputStream("D:\\壁纸\\22.png");
             FileOutputStream fos = new FileOutputStream("day07\\2.png");
        ) {
            //一次读取一个字节数组
            byte[] arr = new byte[8192];
            int len;
            while ((len = fis.read(arr)) != -1) {
                fos.write(arr, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //输入流

    }
}
