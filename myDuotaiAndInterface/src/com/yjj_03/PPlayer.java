/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/6 20:06
 */
package com.yjj_03;

public class PPlayer extends Player implements Eng {

    public PPlayer() {
    }

    public PPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员要吃饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员要学习");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("乒乓球运动员会说英语");
    }
}
