/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/12 15:40
 */
package com.yjj_05;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求：
        用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
        要求：按照总分从高到低出现

    思路：
        1:定义学生类
        2:创建TreeSet集合对象，通过比较器排序进行排序
        3:创建学生对象
        4:把学生对象添加到集合
        5:遍历集合
 */
public class Demo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                //主要条件：总分降序
                int num = s2.getSum() - s1.getSum();
                //次要条件：总分相同时，比语文成绩，升序排列；成绩都相同时，比较名字是否相同。
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });

        Student s1 = new Student("111",1,2);
        Student s2 = new Student("222",2,3);
        Student s3 = new Student("333",3,4);
        Student s4 = new Student("444",4,0);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student s : ts){
            System.out.println(s.getName()+","+s.getSum());
        }
    }
}
