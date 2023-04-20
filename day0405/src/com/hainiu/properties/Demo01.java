package com.hainiu.properties;

/*
使用Properties集合读取和写入属性信息
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //使用Properties集合读取
        FileInputStream fis = new FileInputStream("day0405\\src\\com\\hainiu\\properties\\h.properties");

        Properties prop = new Properties();
        prop.load(fis);
        prop.forEach((k, v) -> System.out.println(k + "=" + v));

        //使用Properties集合写入集合信息
        FileOutputStream fos = new FileOutputStream("day0405\\src\\com\\hainiu\\properties\\h2.properties");

//        Properties prop2 = new Properties();
        prop.setProperty("name","mhf");
        prop.setProperty("age","17");
        prop.setProperty("address","sichuan");

        prop.store(fos,null);

        fos.close();


    }


}
