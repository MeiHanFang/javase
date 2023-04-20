package com.hainiu.practice.Demo;

public class Test {
    public static void main(String[] args) {
       goSwimming(new Swimming() {
           @Override
           public void swim(){
               System.out.println("老铁，我们去游泳吧。");
           }
       });
    }

    /**
     * 使用接口的方法
     */
    public static void goSwimming(Swimming swimming){
        /*
            Swimming swim = new Swimming() {
                @Override
                public void swim() {
                    System.out.println("铁汁, 我们去游泳吧");
                }
            }
         */
        swimming.swim();
    }
}