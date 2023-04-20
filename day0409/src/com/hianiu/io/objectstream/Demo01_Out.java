package com.hianiu.io.objectstream;

//将多个对象序列化到文件 并反序列化重构对象

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo01_Out {
    public static void main(String[] args) throws IOException {
        //对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day0409//obj"));

        //创建对象
        Student s1 = new Student("鹿晗",20,"510525199004201234");
        Student s2 = new Student("梅寒芳",10,"510525200002022222");
        Student s3 = new Student("徐必成",18,"510525199802021234");

        //创建一个ArrayListc存学生对象
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);

        //序列化
      /*  oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);*/
        oos.writeObject(stuList);

        //关流
        oos.close();
    }
}
