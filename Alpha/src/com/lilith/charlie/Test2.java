package com.lilith.charlie;

import java.util.List;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:43 2021/8/3
 * 泛型在编译之后会被擦除，方法重载时，泛型的不同不能当成参数的不同
 */
public class Test2 {

    public static void main(String[] args) {

    }

    public static void main(List<String> strs){

        for (int i = 0; i < strs.size(); i++){
            String str = strs.get(i);
            System.out.println(str.length());
        }
    }
}
