package com.lilith.charlie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:30 2021/7/31
 */
public class TestHashMap2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        // 向集合中加入数据
        map.put("数学",100);
        map.put("数学1",101);
        map.put("数学2",102);
        map.put("数学3",103);
        map.put("数学4",104);

        // 通过键的集合遍历，获取map中所有的键
        Set<String> keySet = map.keySet();

        for (String key : keySet){
            System.out.println(map.get(key));
        }

        // 通过entrySet遍历
        // 一个键值形成一个Entry对象
        // 多个键值就会生成多个entry对象，放入set集合中
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

    }
}
