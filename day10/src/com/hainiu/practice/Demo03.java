package com.hainiu.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03 {
    public static void main(String[] args) {
        //捕获运行时异常
        try {
            int[] arr = new int[3];
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        //捕获编译时异常
        String s = "2000-02-02";
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM-dd");
        Date d = null;
        try {
            d = format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);
    }
}
