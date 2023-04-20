package com.hainiu.myself;




public class Test {
    public static void main(String[] args) {
        //定义一个链表
        LinkedList link = new LinkedList();

        //增加节点
        link.insert(0,7);
        link.append(1);
        link.show();
        link.insert(1,5);
        link.append(2);
        link.show();

        //删除节点
        link.delete(5);
        link.show();

        //修改节点
        link.update(2,77);
        link.show();

        //查找节点，给定一个值，找到对应的节点。
        int index = link.search(7);
        System.out.println(index);
        System.out.println(link.search(3));


    }
}
