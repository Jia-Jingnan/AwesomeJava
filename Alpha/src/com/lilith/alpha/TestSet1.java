package com.lilith.alpha;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:30 2021/7/27
 */
public class TestSet1 {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        // 添加元素
        hashSet.add("小红");
        hashSet.add("小红1");
        hashSet.add("小红2");
        hashSet.add("小红3");
        hashSet.add("小红4");
        hashSet.add("小红5");

        // hashset元素唯一没有索引

        // 遍历
        Iterator iterator = hashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // foreach遍历
        for (String name : hashSet){
            System.out.println(name);
        }

        // 常用API
        // 删除元素
        hashSet.remove("小红1");
        System.out.println("====删除后遍历====");
        for (String name : hashSet){
            System.out.println(name);
        }

        // 查询
        int size = hashSet.size();
        System.out.println(size);

        // 判断是否包含
        boolean contain = hashSet.contains("小红");
        System.out.println(contain);

        // 判断是否为空
        boolean empty = hashSet.isEmpty();
        System.out.println(empty);

        // 和其他集合的相关方法
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("小黑");
        hashSet1.add("小蓝");
        hashSet1.add("小红");
        // 将另一个集合中的所有元素加入到该集合中
        hashSet.addAll(hashSet1);

        System.out.println("====添加集合后遍历====");
        for (String name : hashSet){
            System.out.println(name);
        }

        // removeAll，从set中移除和set1相同的所有元素
        hashSet.removeAll(hashSet1);


        // 保留和另一个集合中相同的元素，不同的全部删掉
        hashSet.retainAll(hashSet1);



    }
}
