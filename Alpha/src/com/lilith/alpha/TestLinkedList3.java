package com.lilith.alpha;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:17 2021/7/27
 */
public class TestLinkedList3 {

    public static void main(String[] args) {

        // 队列数据结构， 先进先出
        Queue<String> queue = new LinkedList<>();
        // 数据加入到队列中
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");

        // 获取头，不移除
        System.out.println(queue.peek());

        // 获取头，移除
        System.out.println(queue.poll());

        // 栈 数据结构, 双端队列, 先进后出
        // 早期 Stack接口表示栈，现在Deque表示栈，双端队列
        Deque<String> deque = new LinkedList<>();
        deque.push("a");
        deque.push("b");
        System.out.println(deque.pop());

    }
}
