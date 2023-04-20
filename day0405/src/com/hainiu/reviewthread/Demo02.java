package com.hainiu.reviewthread;

/*
3、掌握双列集合的遍历
    通过键找值
    通过键值对映射关系（Entry）获取键和值
    通过forEach()方法
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("貂蝉", 15);
        map.put("鲁班", 17);
        map.put("小乔", 13);

        //通过键找值
        Set<String> keySet = map.keySet();
        for (String k : keySet) {
            Integer v = map.get(k);
            System.out.println(k + "=" + v);
        }

        System.out.println("=====");

        //通过键值对映射关系（Entry）获取键和值
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + "=" + v);
        }

        System.out.println("=====");

        //通过forEach()方法
        map.forEach((k, v) -> System.out.println(k + "=" + v));

    }
}
