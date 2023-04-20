package com.hainiu.practice;

/*
1、一段很长的文本：
    查找符合要求（是英文字母或者空格）的连续子串，最长的那个。

    sdfsdafsad!@#$SADFSDAF!@#$231sadfsadf123123sadf1234hello world

    记录找到的每个子串，与之前找到的比较。
 */

public class Demo01 {
    public static void main(String[] args) {
        String str = "sdfsdafsad!@#$SADFSDAF!@#$231sadfsadf123123sadf1234hello world";

        //定义两个字符串存储最长的字符串和临时的字符串
        String finalAtr = "";
        String tempAtr = "";

        //遍历字符串找最长的数组
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isChar(c)) {
                tempAtr += c;
            } else {
                if (finalAtr.length() < tempAtr.length()) {
                    finalAtr = tempAtr;
                }
                tempAtr="";
            }
        }

        //最后一次特殊处理
        if (isChar(str.charAt(str.length()-1))){
            if (finalAtr.length() < tempAtr.length()) {
                finalAtr = tempAtr;
            }
        }

        System.out.println(finalAtr);
    }

    //判断这个字母是不是英文字母或者空格
    public static boolean isChar(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == ' ')) {
            return true;
        } else {
            return false;
        }
    }
}
