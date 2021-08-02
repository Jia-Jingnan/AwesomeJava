package com.lilith.charlie;

import java.util.Date;

/**
 * @Author:JiaJingnan
 * @Date: 上午12:44 2021/8/3
 * 泛型：数据类型的占位符，当不确定数据类型时，使用泛型可以让我们更加灵活的定义方法，接口，类
 * 定义一些可变部分
 */
public class Alpha {

    public static void main(String[] args) {

        Object thor = test1("Thor");
        Date date = test1(new Date());

    }

    // 参数的数据类型不明确，可变化的
    // 就用一个占位符，暂时代替数据类型
    // E 就是数据类型占位符，E就是泛型
    /// 泛型要进行声明才可以使用 <E>
    // 在调用方法时E需要确定具体的数据类型
    // 使用泛型技术最终会确定为一个具体的数据类型
    // 当调用方法时传入具体参数，泛型才会确定具体的数据类型
    public static <E> E test1(E obj){
        return obj;
    }

    // 可以声明多个泛型
    public static <E,T> E test2(E e, T t){
        return e;
    }
}


