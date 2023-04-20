package com.hainiu.practice;

public class Demo {
    public static void main(String[] args) {
        String regex = "[Tt]\\s*[Mm]\\s*[Dd]";
        String s = "你TM   D真是个小可爱，别tmd送了";
        String s1 = s.replaceAll(regex, "***");
        System.out.println(s1);

    }
}
