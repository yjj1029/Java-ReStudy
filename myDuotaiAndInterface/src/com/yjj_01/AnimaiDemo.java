/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/6 16:58
 */
package com.yjj_01;

public class AnimaiDemo {
    public static void main(String[] args) {
        //创建猫类

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(12);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("短毛", 4);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Dog();
        a.setName("史努比");
        a.setAge(15);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Dog("短毛", 4);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
    }
}
