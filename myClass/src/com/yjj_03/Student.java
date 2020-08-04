/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/4 23:26
 */
package com.yjj_03;

/*
    标准类
*/

/*
    成员变量
        使用private修饰

    构造方法
        提供一个无参构造方法
        提供一个带多个参数的构造方法

    成员方法
        提供每一个成员变量对应的setXxx()/getXxx()
        提供一个显示对象信息的show()
 */
public class Student {
    private String name;
    private int age;

    //无参构造方法
    public Student(){}

    //有参构造方法
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name+","+age);
    }


}
