package com.lilith.alpha;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:26 2021/7/26
 */
public class TestArrayList4 {

    public static void main(String[] args) {

        ArrayList<String> alpha = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            alpha.add("章" + i);
        }

        // 使用ListIterator迭代器遍历对象, 可以正向遍历元素，也可以反向遍历元素
        ListIterator<String> listIterator = alpha.listIterator();
        while (listIterator.hasNext()){
            String next = listIterator.next();
            System.out.println(next);
        }

        // 反向遍历元素
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
