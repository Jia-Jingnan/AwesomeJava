package com.lilith.charlie;

/**
 * @Author:JiaJingnan
 * @Date: 上午12:55 2021/8/3
 */
public class Bravo {

    public static void main(String[] args) {

        // 声明类时要确定泛型具体的数据类型
        A<String> a = new A();

        String alpha = a.methoda("asdf");

    }
}

// 在类上使用泛型技术就叫泛型类
// 声明类的对象时确定泛型的具体数据类型
// 泛型类中的泛型仅仅作用于当前对象本身，对其他对象没有作用
class A <T>{

    public T methoda(T t){
        return t;
    }

    // 泛型方法声明的泛型仅仅作用于当前方法
    public T methodb(T t){
        return t;
    }
}