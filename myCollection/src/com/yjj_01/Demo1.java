/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/12 11:23
 */
package com.yjj_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {

    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<>();

        Student s1 = new Student("123",4);
        Student s2 = new Student("123",4);
        Student s3 = new Student("123",4);

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();

        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }


    }
}
