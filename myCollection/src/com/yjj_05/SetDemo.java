/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/12 15:53
 */
package com.yjj_05;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
    需求：
        编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出

    思路：
        1:创建Set集合对象
        2:创建随机数对象
        3:判断集合的长度是不是小于10
            是：产生一个随机数，添加到集合
            回到3继续
        4:遍历集合
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        Random r = new Random();

        while (set.size()<10){

            int num = r.nextInt(20)+1;
            set.add(num);
        }

        for (Integer i :set){
            System.out.println(i);
        }

    }
}
