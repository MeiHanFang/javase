package com.hainiu.datastructure;

public class Test {
    public static void main(String[] args) {
        LinkedList newList = new LinkedList();
        newList.insert(0, 1);
        newList.append(9);
        newList.insert(2, 2);
        newList.append(7);
        newList.display();
        //查找
        System.out.println();
        System.out.println(newList.search(1));
        System.out.println(newList.search(0));
        //更新
        newList.update(2, 9);
        newList.display();
    }
}
