package com.hainiu.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStream {
    public static void main(String[] args) throws IOException {
        //字节输出流 用于写
        FileOutputStream fos = new FileOutputStream("day0408//b.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //一个字节一个字节的写 char型会自动转为int型
        bos.write('a');
        bos.write('b');
        bos.write('c');
//        bos.write('中');
        bos.write(97);
        bos.write(new byte[]{'h','h','h'});
        bos.write("\r\n".getBytes());
        bos.write("mei".getBytes());
        bos.write(new byte[]{'c','c','c'},0,2);

//        fos.close();
        bos.close();

    }
}
