package com.hainiu.reviewthread;

/*
3、统计一段文本中的某个单词出现的次数，参见stringdemo Demo06
 */

public class Demo01 {
    public static void main(String[] args) {
        String str = "wnivbiluhanwhcculuhanluhanxuuluhanswidhluhanluhanluhan";
        String word = "luhan";
        System.out.println(wordNumber(str, word));
    }

    public static int wordNumber(String str, String word) {
        //定义计数器
        int count = 0;
        //从0索引开始找
        int index = 0;
        while ((index = str.indexOf(word,index)) != -1) {
            //找到了
            count++;
            index += word.length();
        }
        return count;
    }
}
