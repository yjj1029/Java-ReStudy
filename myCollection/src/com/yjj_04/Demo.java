/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/12 15:29
 */
package com.yjj_04;

import java.util.Comparator;
import java.util.TreeSet;

/*
    存储学生对象并遍历，创建TreeSet集合使用带参构造方法
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class Demo {
    public static void main(String[] args) {
        //匿名内部类
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        //创建学生对象
        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 28);
        Student s3 = new Student("diaochan", 30);
        Student s4 = new Student("yangyuhuan", 33);

        Student s5 = new Student("linqingxia",33);
        Student s6 = new Student("linqingxia",33);

        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }


}
