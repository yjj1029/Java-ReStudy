/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/6 20:06
 */
package com.yjj_03;

public class BPlayer extends Player{

    public BPlayer() {
    }

    public BPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员要吃饭");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员要学习");
    }
}
