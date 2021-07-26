package com.lilith.alpha;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:10 2021/7/26
 */
public class TestArrayList3 {

    public static void main(String[] args) {
        ArrayList<String> alpha = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            alpha.add("章" + i);
        }

        // 使用迭代器遍历集合
        // 通过集合对象获取迭代器对象
        Iterator<String> iterator = alpha.iterator();

        // 判断是否有下一个元素, 开始时游标在第一个元素的上一个位置,只要列表不为空，hasNext一定返回true
        // boolean b = iterator.hasNext();
        // System.out.println(b);
        // 将游标移动到下一个位置,即集合中的第一个元素
        // String next = iterator.next();
        // System.out.println(next);

        // 继续判断是否有下一个，然后取出
        // boolean b1 = iterator.hasNext();
        // System.out.println(b);
        // 将游标移动到下一个位置,即集合中的第一个元素
        // String next2 = iterator.next();
        // System.out.println(next);

        // 用循环替代
        /*while (iterator.hasNext()){ // 判断是否有下一个
            System.out.println(iterator.next()); //取出下一个元素
        }*/

        System.out.println(alpha.size());

        // 使用迭代器遍历时，只用使用迭代器删除元素，否则会报异常ConcurrentModificationException
        while (iterator.hasNext()){ // 判断是否有下一个
            String s = iterator.next();
            // alpha.remove(s);
            // 使用迭代器删除对象
            System.out.println(s);
            iterator.remove();
        }

        System.out.println(alpha.size());


    }

}
