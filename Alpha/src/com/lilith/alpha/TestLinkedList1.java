package com.lilith.alpha;

import java.util.LinkedList;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:45 2021/7/26
 */
public class TestLinkedList1 {

    public static void main(String[] args) {
        LinkedList<Integer> alpha = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            alpha.add(i);
        }

        // 测试是否有序
        alpha.add(1);

        for (int i = 0; i < alpha.size(); i++){
            System.out.println(alpha.get(i));
        }

        // 底层使用链表结构实现，具有ArrayList没有的API

    }




}
