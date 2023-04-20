package review.api;

/*
5、生成验证码  四位的字符串  可选字符包含：大写字母小写字母数字
    通过索引操作数据
 */

import java.util.Random;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        String s = "";
        for (char c = 'a'; c <= 'z'; c++) {
            s += c;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            s += c;
        }
        for (char c = '0'; c <= '9'; c++) {
            s += c;
        }
        System.out.println(s);

        StringBuilder yzm = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(s.length());
            char c = s.charAt(index);
            yzm.append(c);
        }
        String s1 = yzm.toString();
        System.out.println(s1);
        Scanner sc = new Scanner(System.in);
        String myYzm = sc.nextLine();
        System.out.println(s1.equalsIgnoreCase(myYzm));

    }

}
