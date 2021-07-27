package com.lilith.alpha;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:03 2021/7/27
 */
public class TestArrayList5 {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("小明", 15000.0));
        employeeList.add(new Employee("小红", 5000.0));
        employeeList.add(new Employee("小花", 2000.0));
        employeeList.add(new Employee("小黑", 12000.0));
        employeeList.add(new Employee("小白", 30000.0));
        
        
        // 遍历集合
        for (Employee employee : employeeList){
            System.out.println(employee);
        }

        // 移除，一边遍历一边移除
        // for循环移除
        /*for (int i = 0; i < employeeList.size(); i++){
            Employee employee = employeeList.get(i);
            if (employee.getSalary() < 10000.0){
                employeeList.remove(i);
                i--; //重新指向原来的位置
            }
        }*/

        // 迭代器移除
        Iterator iterator = employeeList.iterator();

        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if (employee.getSalary() < 10000.0){
                iterator.remove();
            }
        }

        // 移除后遍历
        System.out.println("=====移除后遍历=====");
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
