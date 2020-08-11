/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/11 11:05
 */
package com.Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");

        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();

        c.set(year, 2, 1);

        c.add(Calendar.DATE, -1);

        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);

        System.out.println(month + "月" + date + "日");
    }
}
