package com.lilith.alpha;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * @Author:JiaJingnan
 * @Date: 上午12:38 2021/7/27
 */
public class MyLinkedList {

    // 用户存储链表的开头
    private MyNode first;

    // 存储链表的结尾
    private MyNode last;

    // 存储元素的个数
    int size;

    public void add(Object obj){
        addLast(obj);
    }

    public void addLast(Object obj){
        // 创建一个Node,作为最后一个元素
        MyNode node = new MyNode(obj,null,last);
        // 让链表中原来最后一个元素的last指向新加的元素
        if (last == null || first == null){
            first = node; // 原链表为空链表，新增的元素是链表中唯一一个元素
            last = node;
        }


    }





    class MyNode{
        // 当前节点要存储的数据
        Object ele;
        MyNode next;
        MyNode prev;

        public MyNode(Object ele, MyNode next, MyNode prev) {
            this.ele = ele;
            this.next = next;
            this.prev = prev;
        }
    }

}


