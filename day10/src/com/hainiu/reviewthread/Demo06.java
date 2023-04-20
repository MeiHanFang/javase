package com.hainiu.reviewthread;

/*
正则表达式的获取功能
String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
找到匹配的子串并获取
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo06 {
    public static void main(String[] args) {
        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        //创建compile对象
        Pattern compile = Pattern.compile("1[3-9]\\d{9}");
        //创建匹配器
        Matcher matcher = compile.matcher(str);

        //找到匹配的子串并获取
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
