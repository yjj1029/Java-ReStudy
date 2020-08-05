/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/5 15:21
 */
package com.yjj_02;


import java.util.ArrayList;
import java.util.Scanner;

/*
    需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
         学生的姓名和年龄来自于键盘录入

    思路：
        1:定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为String类型
        2:创建集合对象
        3:键盘录入学生对象所需要的数据
        4:创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        5:往集合中添加学生对象
        6:遍历集合，采用通用遍历格式实现
 */
public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Student> array = new ArrayList<>();

        /*Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();


        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();


        Student s = new Student();

        s.setAge(age);
        s.setName(name);

        array.add(s);*/

        addStudent(array);
        addStudent(array);
        addStudent(array);

        for (int i = 0; i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+"，"+s.getAge());

        }
    }


    //将录入部分封装成一个方法
    public static void addStudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();


        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();


        Student s = new Student();

        s.setAge(age);
        s.setName(name);

        array.add(s);
    }
}
