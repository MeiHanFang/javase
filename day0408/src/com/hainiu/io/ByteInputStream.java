package com.hainiu.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteInputStream {
    public static void main(String[] args) throws IOException {
        //字节输入流 用于读文件
        FileInputStream fis = new FileInputStream("day0408//a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

      /*  //一个字节一个字节的读
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }*/

        //字节数组读
        byte[] byteChars = new byte[8192];
        int len;
        while ((len = bis.read(byteChars)) != -1) {
            System.out.println(new String(byteChars,0,len));
        }

        fis.close();
        bis.close();
    }
}
