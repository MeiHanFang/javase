package com.hainiu.reviewthread;

/*
10、实现日期对象和字符串之间的相互转换
    格式化 format     解析 parse
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04 {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date date = new Date();
        //将日期对象转化成字符串
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = format.format(date);
        System.out.println(s);

        //将字符串转化为日期对象
        String str = "2000-02-02 02:02:02";
//        SimpleDateFormat parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = format.parse(str);
        System.out.println(date1);
    }
}
