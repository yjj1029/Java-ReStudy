/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/4 23:32
 */
package com.yjj_03;


/*
    创建对象并为其成员变量赋值的两种方式
        1:无参构造方法创建对象后使用setXxx()赋值
        2:使用带参构造方法直接创建带有属性值的对象
*/
public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("124");
        s1.setAge(1234);
        s1.show();

        Student s2 = new Student("1341",14432413);
        s2.show();


    }

}
