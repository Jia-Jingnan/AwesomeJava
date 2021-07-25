package com.lilith.alpha;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Author:JiaJingnan
 * @Date: 下午8:11 2021/7/24
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
    }


}
