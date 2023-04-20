package com.hianiu.io.properties;

//Properties集合可以保存到流中或从流中加载

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException {
        //从流中加载
//        load();

        //保存到流中
        store();

    }

    private static void store() throws IOException {
        //字节输出流
//        FileOutputStream fos = new FileOutputStream("day0409\\hhh2.properties");
        FileWriter fw = new FileWriter("day0409\\hhh2.properties");

        //创建一个Properties集合增添数据并保存到流中
        Properties properties = new Properties();
        properties.setProperty("name","徐必成");
        properties.setProperty("age","22");
        properties.setProperty("address","sichuan");

        //保存到流中
        properties.store(fw,null);

        //关流
//        fos.close();
        fw.close();
    }

    private static void load() throws IOException {
        //字节输入流
        FileInputStream fis = new FileInputStream("day0409\\hhh.properties");

        //创建一个Properties集合保存从流中加载的数据
        Properties properties = new Properties();

        //从流中加载
        properties.load(fis);

        //遍历集合打印数据
        properties.forEach((k, v) -> System.out.println(k + "=" + v));

        //关流
        fis.close();
    }
}
