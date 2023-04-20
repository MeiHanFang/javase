package com.hainiu.reviewthread;

/*
6、"12 56 34 112 23 66 11 18 35" -- 把其中的数据按照从小到大的顺序排列 组成一个新的字符串 参见 intergerdemo Demo03
    通过这个案例掌握 字符串与整数之间的互换
 */

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        String str = "12 56 34 112 23 66 11 18 35";
        String newStr = sort(str);
        System.out.println(newStr);

    }

    public static String sort(String str) {
        //根据空格拆分
        String[] s = str.split("\\s");
        //因为字符串数组是根据字典规则排序 所以将字符串数组转换成整数数组
        //定义一个整数数组
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        //排序
        Arrays.sort(arr);

        //创建StringBuilder对象存放排除好的数组
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            s1.append(arr[i]);
            if (i!=arr.length-1){
                s1.append(" ");
            }
        }

        //将StringBuilder对象转换成字符串并返回
        return s1.toString();
    }
}


