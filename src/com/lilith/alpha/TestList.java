package com.lilith.alpha;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:32 2021/7/26
 */
public class TestList {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            studentList.add(new Student("name" + i, "男", 20-i, 89+i));
        }

        for (Student student : studentList){
            System.out.println(student);
        }

        // 判断是否包含指定学生
        Student student1 = new Student("name1", "男", 19, 90);

        System.out.println(studentList.contains(student1));
    }
}
