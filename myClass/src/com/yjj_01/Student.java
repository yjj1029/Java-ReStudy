/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/4 18:03
 */
package com.yjj_01;

/*
    学生类
*/

public class Student {
    private int age;
    private String name;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return  name;
    }

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return  age;
    }

    public void show(){
        System.out.println(name+","+age);
    }
}
