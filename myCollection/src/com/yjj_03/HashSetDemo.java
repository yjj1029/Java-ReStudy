/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/12 15:02
 */
package com.yjj_03;

import java.util.HashSet;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        要求：学生对象的成员变量值相同，我们就认为是同一个对象

    思路：
        1:定义学生类
        2:创建HashSet集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(增强for)
 */
public class HashSetDemo {
    public static void main(String[] args) {

        //创建HashSet集合对象
        //为了保证元素的唯一性，需要重写equals和hasCode方法
        HashSet<Student> hs = new HashSet<Student>();

        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 35);
        Student s3 = new Student("王祖贤", 33);
        Student s4 = new Student("王祖贤", 33);

        //把学生添加到集合
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        //遍历集合(增强for)
        for (Student s:hs){
            System.out.println(s.getName()+","+s.getAge());
        }


    }
}
