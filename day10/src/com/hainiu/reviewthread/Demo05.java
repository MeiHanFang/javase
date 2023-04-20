package com.hainiu.reviewthread;

/*
3、统计一段文本中的某个单词出现的次数，参见stringdemo Demo06
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo05 {
    public static void main(String[] args) {
        String str = "luhanbqbcucluhanuhuchluhanluhanluhanuhufhluhanhuwfhuewluuw";
//        String word = "luhan";
//        System.out.println(wordNumber(str, word));

        Pattern compile = Pattern.compile("luhan");
        Matcher matcher = compile.matcher(str);
        int count = 0;

        while (matcher.find()){
            count++;
        }
        System.out.println(count);

    }

    public static int wordNumber(String str, String word) {
        //计数器
        int count = 0;
        //定义索引表示从0索引开始找
        int index = 0;
        while ((index = str.indexOf(word, index)) != -1) {
            //找到了
            count++;
            index += word.length();
        }
        return count;
    }
}
