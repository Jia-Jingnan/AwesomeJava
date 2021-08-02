package com.lilith.charlie;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @Author:JiaJingnan
 * @Date: 下午12:20 2021/8/1
 */
public class TestLinkedHashMap {

    public static void main(String[] args) {


        HashSet<String> set = new LinkedHashSet<>();

        set.add("adf");
        set.add("dfd");
        set.add("zvd");

        for (String string : set){
            System.out.println(string);
        }
    }
}
