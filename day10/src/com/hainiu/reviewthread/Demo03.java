package com.hainiu.reviewthread;

/*
7、实现浮点数的精确运算 参见 intergerdemo Demo04
 */


import java.math.BigDecimal;
import java.math.RoundingMode;


public class Demo03 {
    public static void main(String[] args) {
        double x = 10;
        double y = 3;
        double result1 = add(x, y);
        double result2 = substract(x, y);
        double result3 = multiply(x, y);
        double result4 = divide(x, y);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }

    public static double add(double x,double y){
        BigDecimal a = new BigDecimal(String.valueOf(x));
        BigDecimal b = new BigDecimal(String.valueOf(y));
        return a.add(b).doubleValue();
    }

    public static double substract(double x,double y){
        BigDecimal a = new BigDecimal(String.valueOf(x));
        BigDecimal b = new BigDecimal(String.valueOf(y));
        return a.subtract(b).doubleValue();
    }

    public static double multiply(double x,double y){
        BigDecimal a = new BigDecimal(String.valueOf(x));
        BigDecimal b = new BigDecimal(String.valueOf(y));
        return a.multiply(b).doubleValue();
    }

    public static double divide(double x,double y){
        BigDecimal a = new BigDecimal(String.valueOf(x));
        BigDecimal b = new BigDecimal(String.valueOf(y));
        return a.divide(b,5, RoundingMode.HALF_UP).doubleValue();
    }

}

