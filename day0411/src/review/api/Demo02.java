package review.api;

/*
4、String str = "hellojavaworldjavabigdatajavajava"; 有几个java单词
    查找并截取
    改变查询范围 不截取
 */

public class Demo02 {
    public static void main(String[] args) {
        String str = "hellojavaworldjavabigdatajavajava";
        String key = "java";
        int i = englishNum(str, key);
        System.out.println(i);
    }

    public static int englishNum(String str, String key) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(key, index)) != -1) {
            count++;
            index += key.length();
        }
        return count;
    }
}


