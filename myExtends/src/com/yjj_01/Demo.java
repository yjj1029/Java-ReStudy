/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/6 14:26
 */
package com.yjj_01;

public class Demo {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("123");
        t1.setAge(12);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("456",4);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();

    }


}
