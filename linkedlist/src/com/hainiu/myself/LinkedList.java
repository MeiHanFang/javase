package com.hainiu.myself;

//定义一个链表类

public class LinkedList {
    //定义节点 内部类只为其外部类使用
    //要创建嵌套类的对象，并不需要其外围类的对象,直接用.next
     private static class Node {
        //值
        int val;
        //索引 指针 指向下一个节点
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    //头节点
    Node head;
    //尾节点
    Node tail;
    //长度
    int length;

    public LinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    //增加新元素在尾部
    public void append(int var) {
        //创建节点
        Node newNode = new Node(var);

        if (tail == null) {
            //尾节点为空 直接将新节点赋值给尾节点即可
            tail = newNode;
        } else {
            //尾节点不为空
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //插入节点
    public void insert(int position, int var) {
        //如果插入的位置小于0或者大于链表的长度 无法插入
        if (position < 0 || position > length) {
            return;
        }
        //创建节点
        Node newNode = new Node(var);

        if (position == 0) {
            //在头部之前插入节点，让新节点的下一个节点指向原头部节点，再把头部节点引用设置为新的节点。
            newNode.next = head;
            head = newNode;
            //如果尾节点为空 说明该链表没有节点 因此插入的节点也是尾节点
            if (tail == null) {
                tail = newNode;
            }
            length++;
        } else if (position == length) {
            //在尾部插入节点，找到尾部节点，让尾部节点的下一个节点指向新节点。
            this.append(var);
        } else {
            //在指定位置插入新节点
            //找到要插入位置的前一个节点
            Node pre = head;
            for (int i = 0; i < position - 1; i++) {
                pre = pre.next;
            }
            //让新节点指向查找到的节点后面的节点
            newNode.next = pre.next;
            //再让前一个节点指向新节点
            pre.next = newNode;
            length++;
        }

    }

    //打印节点
    public void show() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //删除节点
    public void delete(int val) {
        if (head != null && head.val == val) {
            //删除头部节点，把头部节点的引用设置为下一个节点。
            head = head.next;
            length--;
            //如果长度为0 说明只有一个节点 即头节点和尾节点是同一个 因此尾节点也需要改变
            if (length == 0) {
                tail = head;
            }
        } else {
            //删除节点的上一个节点
            Node prev = head;
            //要删除的节点
            Node cur = head.next;
            while (cur != null) {
                if (cur.val == val) {
                    if (cur == tail) {
                        //删除的是尾节点 因此尾节点就变成要删除的节点的上一个节点
                        tail = prev;
                    }
                    //让删除的节点的前置节点指向要删除的节点的后继节点
                    prev.next = cur.next;
                    length--;
                    return;
                }
                prev = cur;
                cur = cur.next;
            }
        }
    }

    //查找节点，给定一个值，找到对应的节点。
    public int search(int val) {
        Node cur = head;
        for (int i = 0; cur != null; i++) {
            if (cur.val == val) {
                return i;
            }
            cur = cur.next;
        }
        return -1;
    }

    //更新，和查找类似，找到对应的节点，改变节点的值即可；
    public void update(int oldVal, int newVal) {
        Node cur = head;
        for (int i = 0; cur != null; i++) {
            if (cur.val == oldVal) {
                cur.val = newVal;
                return;
            }
            cur = cur.next;
        }
    }


}
