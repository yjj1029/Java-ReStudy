/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/11 17:28
 */
package com.yjj_02;

public class test {

    public void checkScore(int score) throws demo1 {
        if (score<0 || score>100){
            throw new demo1("你输入的分数不正确");
        }else {
            System.out.println("分数正常");
        }

    }
}
