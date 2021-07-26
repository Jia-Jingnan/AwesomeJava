package com.lilith.alpha;

import sun.security.util.AuthResources_ko;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Author:JiaJingnan
 * @Date: 下午8:11 2021/7/24
 *  ArrayList
 *  1.有序，放入有顺序
 *  2.元素可以重复
 *  3.有索引
 *  ArrayList内部维护了一个Object[] elementData数组用于存储放入的元素
 *  当第一次放入元素时，elementData的长度为10
 *  如果继续放入元素elementData会进行扩容，新容量是原来的1.5倍
 */
public class TestArrayList1 {

    public static void main(String[] args) {
        // 一组性质相同或相近的数据的集合
        // 通过泛型泛型控制数据类型
        // 创建一个容器对象
        ArrayList<String> alpha = new ArrayList();
        // 向容器中添加一些数据
        alpha.add("张三");
        alpha.add("张四");
        alpha.add("张五");
        alpha.add("张六");
        alpha.add("张七");
        alpha.add("张八");
        // 查看容器中的数据
        System.out.println(alpha);

        // 遍历集合
        System.out.println(alpha.size());
        System.out.println(alpha.get(1));

        for (int i = 0; i < alpha.size(); i++){
            System.out.println(alpha.get(i));
        }

        // 当数组中有大量空余元素位置时，可以用该方法取出空余元素位
        alpha.trimToSize();
    }


}
