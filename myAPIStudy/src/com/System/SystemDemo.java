/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/7 16:47
 */
package com.System;

public class SystemDemo {
    public static void main(String[] args) {
//        System.out.println("开始");
//        结束java虚拟机
//        System.exit(0);

//        System.out.println("结束");
//      这是与1970年1月1日之间的毫秒时间
//        System.out.println(System.currentTimeMillis());
        //      这是与1970年1月1日之间的差年
//        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        long start = System.currentTimeMillis();

        for (int i = 0; i<10000;i++){
            System.out.println(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end-start)+"毫秒");


    }
}
