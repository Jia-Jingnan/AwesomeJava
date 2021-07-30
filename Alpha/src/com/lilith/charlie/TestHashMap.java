package com.lilith.charlie;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:18 2021/7/31
 *
 * 数据以键值对的方式存储
 * 键不能重复，值可以重复
 * 放入重复的键，键只能保留一个，但是最后放入的值会覆盖之前的值
 */
public class TestHashMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        // 保存与更新方法
        map.put("数学",100);
        map.put("外语",85);
        map.put("历史",100);
        map.put("历史",101);

        // 是否包含contains
        map.containsKey("数学");
        map.containsValue(101);

        // 集合长度
        map.size();

        map.isEmpty(); // 判断是否为空集

        // 替换
        map.replace("数学",120);

        // 清空集合
        // map.clear();

        // 清除map中的键
        map.remove("数学");
        map.remove("数学",120);

        // vlaues, 获取所有的value
        map.values();


        System.out.println(map);

    }
}
