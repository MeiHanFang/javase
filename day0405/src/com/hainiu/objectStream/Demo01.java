package com.hainiu.objectStream;

/*
对象操作流
如果一个类的对象能够被序列化操作，必须实现Serializable接口，提供一个固定的序列化版本号。
练习将多个对象序列化到文件 并反序列化重构对象。
 */

import java.io.*;
import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化
        write();

        //反序列化
        read();


    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day0405//obj"));

        Object o = ois.readObject();
        ArrayList<Worker> arrList = (ArrayList<Worker>) o;

        ois.close();

        for (Worker worker : arrList) {
            System.out.println(worker);
        }
    }

    private static void write() throws IOException {
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day0405//obj"));

        ArrayList arrList = new ArrayList();
        arrList.add(new Worker("鹿晗",22,10000));
        arrList.add(new Worker("梅寒芳",20,7000));
        arrList.add(new Worker("王勉",25,6000));

        oos.writeObject(arrList);

        oos.close();
    }
}
