package com.lilith.alpha;

import java.util.HashSet;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:45 2021/7/27
 */
public class TestSet2 {

    public static void main(String[] args) {

        HashSet<Person> personHashSet = new HashSet<>();

        personHashSet.add(new Person(1, "张三", "男"));
        personHashSet.add(new Person(2, "张四", "男"));
        personHashSet.add(new Person(3, "张五", "男"));
        personHashSet.add(new Person(4, "张六", "男"));
        personHashSet.add(new Person(5, "张七", "男"));
        personHashSet.add(new Person(5, "张七", "男"));


        for (Person person : personHashSet){
            System.out.println(person);
        }

    }
}
