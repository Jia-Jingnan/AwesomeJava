package com.lilith.charlie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author:JiaJingnan
 * @Date: 下午12:28 2021/8/1
 */
public class TestCollections {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        String[] arr = {"d","e","f"};
        Collections.addAll(list,arr);
        System.out.println(list);
    }
}
