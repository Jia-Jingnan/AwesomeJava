package com.lilith.charlie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author:JiaJingnan
 * @Date: 上午9:33 2021/7/31
 */
public class TestHashMap3 {

    public static void main(String[] args) {

        Map<Student,Integer> map = new HashMap<>();

        map.put(new Student(1,"name1",12,61),61);
        map.put(new Student(2,"name2",12,62),62);
        map.put(new Student(3,"name3",12,63),63);
        map.put(new Student(4,"name4",12,64),64);
        map.put(new Student(5,"name5",12,65),65);
        map.put(new Student(6,"name5",12,66),66);

        Set<Map.Entry<Student, Integer>> entries = map.entrySet();

        for (Map.Entry entry : entries){
            System.out.println(entry.getKey()+ "," + entry.getValue());
        }

        // 键需要重写hashcode和equals方法，值只需要重写equals方法
        boolean containsKey = map.containsKey(new Student(1, "name1", 12, 61));
        System.out.println(containsKey);

        System.out.println(map.containsValue(61));





    }
}


/*
class Student{
    private int id;
    private String name;
    private int age;
    private int score;

    public Student(int id, String name, int age, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }


    public Student() {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals方法被调用了");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (age != student.age) return false;
        if (score != student.score) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode方法被调用了");
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + score;
        return result;
    }
}
*/
