package com.lilith.alpha;

import java.util.LinkedList;

/**
 * @Author:JiaJingnan
 * @Date: 上午2:04 2021/7/26
 */
public class TestLinkedList2 {

    public static void main(String[] args) {
        LinkedList<String> alpha = new LinkedList<>();

        alpha.add("a");
        alpha.add("b");
        alpha.add("c");

        // LinkedList特有的方法
        alpha.addFirst("X");
        alpha.addLast("Y");

        System.out.println(alpha.removeFirst());
        System.out.println(alpha.removeLast());

        //
        System.out.println(alpha.getFirst());
        System.out.println(alpha.getLast());
        System.out.println(alpha);
    }
}
