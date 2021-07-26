package com.lilith.alpha;

import java.util.Objects;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:30 2021/7/26
 */
public class Student {

    private String name;
    private String gender;
    private int age;
    private int score;

    public Student(String name, String gender, int age, int score) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        System.out.println("调用了equals方法，对比了"+ this.name+ "和" + student.name);
        return age == student.age &&
                score == student.score &&
                Objects.equals(name, student.name) &&
                Objects.equals(gender, student.gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
}
