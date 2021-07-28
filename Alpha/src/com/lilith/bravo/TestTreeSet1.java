package com.lilith.bravo;

import javax.sound.midi.Soundbank;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Author:JiaJingnan
 * @Date: 上午12:45 2021/7/28
 * treeSet集合存放数据是有序的，会自动进行排序，元素也是唯一的
 */
public class TestTreeSet1 {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("b");
        treeSet.add("a");
        treeSet.add("e");
        treeSet.add("g");
        // 查看集合元素
        System.out.println(treeSet);

        // 遍历
        for (String el : treeSet){
            System.out.println(el);
        }

        // 迭代器遍历
        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 常用API
        // 删除, 清空集合
        // treeSet.clear();
        // remove

        treeSet.remove("c");

        // 判断是否包含
        System.out.println(treeSet.contains("a"));

        // 返回第一个元素
        System.out.println(treeSet.first());
        // 返回最后一个元素
        System.out.println(treeSet.last());
        // 天花板元素, 大于等于给定元素的第一个元素
        System.out.println(treeSet.ceiling("c"));
        // 地板元素，小于等于给定的元素的第一个元素
        System.out.println(treeSet.floor("c"));

        // 更大的元素
        System.out.println(treeSet.higher("c"));

        // 更小的元素
        System.out.println(treeSet.lower("c"));

        // 倒叙的迭代器
        Iterator iterator1 = treeSet.descendingIterator();
        // 倒叙遍历集合
        while (iterator1.hasNext()){
            System.out.println(iterator1.next() + "\t");
        }

        // 取出第一个元素
        System.out.println(treeSet.pollFirst());

        // 取出最后一个
        System.out.println(treeSet.pollLast());

        // 截取字符串, 包头不包尾
        treeSet.subSet("c","g");

        // 从头截取至指定字符串, true表示包含尾部
        SortedSet<String> e = treeSet.headSet("e");

        // 从尾部截取
        SortedSet<String> e1 = treeSet.tailSet("e",true);

    }
}
