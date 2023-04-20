package com.hainiu.practice;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        String s = "我..我....我.我...我.要.要...要...要..要...要.学..学.学...学.学.编...编.编..编...编...程程..程..程";

        //替换.
        String s1 = s.replaceAll("\\.","");
        System.out.println(s1);

        //我我我我我要要要要要要学学学学学编编编编编程程程程
        //叠词规则
        String regex = "(.)\\1+";
        //替换
        String s2 = s1.replaceAll(regex, "$1");
        System.out.println(s2);



    }
}
