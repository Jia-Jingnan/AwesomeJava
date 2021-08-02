package com.lilith.charlie;

import java.util.List;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:02 2021/8/3
 */
public class Charlie<C> {


    // 泛型向上限定，固定了上线的父类只能是**级别
    public void methodA(List<? extends C> list){

    }

    // 泛型向下限定，规定了下限的子类只能是**
    public void mehtodB(List<? super C> list){

    }

}

// 泛型接口是在实现接口时确定的数据类型
// 泛型的好处就是减少手动书写强制转换代码


