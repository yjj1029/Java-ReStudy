/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/10 12:14
 */
package com.Date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        Date d1 = new Date();
        System.out.println(d1);//Mon Aug 10 12:15:33 CST 2020

        long date = 1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);
    }
}
