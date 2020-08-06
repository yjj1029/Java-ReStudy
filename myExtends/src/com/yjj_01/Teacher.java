/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/6 14:26
 */
package com.yjj_01;

public class Teacher extends Person {

    public Teacher(){}

    public Teacher(String name,int age){
        //使用父类的带参构造方法来传递值
        super(name,age);
    }

    public void teach(){
        System.out.println("教书");
    }
}
