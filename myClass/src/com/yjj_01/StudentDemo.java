/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/4 18:08
 */
package com.yjj_01;

/*
*  学生测试类
* */
public class StudentDemo {

    public static void main(String[] args) {
        Student s = new Student();

        s.setName("张三");
        s.setAge(1);

        s.show();

//      可以使用get方法获取成员变量的值
        System.out.println(s.getName()+"----"+s.getAge());

    }
}
