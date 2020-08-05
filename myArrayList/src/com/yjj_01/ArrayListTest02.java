/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/5 15:12
 */
package com.yjj_01;


import java.util.ArrayList;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建集合对象
        3:创建学生对象
        4:添加学生对象到集合中
        5:遍历集合，采用通用遍历格式实现
 */
public class ArrayListTest02 {

    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("熊大",13);
        Student s2 = new Student("熊二",12);
        Student s3 = new Student("张三",11);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (int i = 0;i <array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }


    }





}
