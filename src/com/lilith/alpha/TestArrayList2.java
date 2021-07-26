package com.lilith.alpha;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:JiaJingnan
 * @Date: 上午12:52 2021/7/26
 */
public class TestArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> alpha = new ArrayList<>();

        // 增加数据
        for (int i = 0 ; i <= 10; i++){
            // 向集合的后面追加元素
            alpha.add("章" + i);
        }
        // 指定处追加元素
        alpha.add(5,"小明");

        // 删除数据
        alpha.remove(5);
        alpha.remove("章10");

        // 修改数据
        alpha.set(4,"小红");
        // 查询数据
        // 获得数组中元素，根据索引
        System.out.println(alpha.get(2));

        boolean contain = alpha.contains("章3");
        System.out.println(contain);
        boolean contain2 = alpha.contains("章15");
        System.out.println(contain2);

        // 截取集合, 包头不包尾
        List<String> bravo = alpha.subList(2, 4);
        System.out.println(bravo);
        for (int i = 0; i < bravo.size(); i++){
            System.out.println(bravo.get(i));
        }
        // 遍历集合
        // 使用for循环遍历
        for (int i = 0; i < alpha.size(); i++){
            System.out.println(alpha.get(i));
        }

        // foreach循环遍历
        for (String str : alpha){
            System.out.println(str);
        }

        //迭代器遍历
        System.out.println("=========迭代器遍历=========");
        // Iterator 迭代器接口，对所有的集合类提出了一个特定的迭代要求，所有容器类必须实现
        // 使用迭代器可以屏蔽卖给不同的集合的存储数据的特点
    }
}
