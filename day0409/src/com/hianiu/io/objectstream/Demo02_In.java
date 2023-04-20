package com.hianiu.io.objectstream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Demo02_In {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象输出流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day0409//obj"));

/*        //读里面存入的对象
        Student o = (Student) ois.readObject();
        System.out.println(o);
        System.out.println(o.getName());
        System.out.println(o.getAge());*/

        //读多个对象
        //文件输出流 到达文件末尾会抛出一个异常EOFException（到达文件末尾异常） 需要我们手动抓异常
     /*   while (true){
            try {
                Object o = ois.readObject();
                System.out.println(o);
            } catch (EOFException e) {
                e.printStackTrace();
                //到达文件末尾 跳出循环
                break;
            }
        }*/

        //读取
        Object o = ois.readObject();
        ArrayList<Student> list = (ArrayList<Student>) o;

        //遍历集合查看学生信息
        for (Student student : list) {
            System.out.println(student);
        }


        //关流
        ois.close();
    }
}
