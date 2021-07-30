package com.lilith.bravo;

import java.util.TreeSet;

/**
 * @Author:JiaJingnan
 * @Date: 上午2:32 2021/7/28
 *
 * treeSet是一个有序的集合，从第一个元素放入的时候就开始排序，每放入一个元素都会进行一次顺序处理
 * 自定义对象放入TreeSet时要先实现Compare接口
 */
public class TestTreeSet2 {

    public static void main(String[] args) {

        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person(3,"李四",10));
        treeSet.add(new Person(4,"张三",10));
        treeSet.add(new Person(2,"王五",10));
        treeSet.add(new Person(5,"赵六",10));
        treeSet.add(new Person(1,"刘七",10));
        treeSet.add(new Person(6,"小明",10));

        for (Person person : treeSet){
            System.out.println(person);
        }

    }
}


class Person implements Comparable<Person>{

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public int compareTo(Person o) {
        System.out.println("compareTo方法被调用了");
        return this.id-o.id;
    }
}