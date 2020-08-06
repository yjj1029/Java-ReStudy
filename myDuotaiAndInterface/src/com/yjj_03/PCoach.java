/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/6 20:05
 */
package com.yjj_03;

public class PCoach extends Coach implements Eng{

    public PCoach() {
    }

    public PCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练要吃饭");

    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("乒乓球人员要说英语");
    }
}
