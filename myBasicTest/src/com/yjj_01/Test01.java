/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/4 13:11
 */
package com.yjj_01;

import java.util.Scanner;

/*
    需求：输入星期数，显示今天的减肥活动
            周一：跑步
            周二：游泳
            周三：慢走
            周四：动感单车
            周五：拳击
            周六：爬山
            周日：好好吃一顿

    思路：
        1:键盘录入一个星期数，用一个变量接收
        2:对星期数进行判断，这里用 if 语句实现
        3:在对应的语句控制中输出对应的减肥活动
 */
public class Test01 {
    public static void main(String[] args) {

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个星期数：");

//        1:键盘录入一个星期数，用一个变量接收
            int week = sc.nextInt();
            if (week < 1 || week > 7){
                System.out.println("error");
            } else {
                String day = ifWeek(week);
                System.out.println(day);
            }

//        2:对星期数进行判断，这里用 if 语句实现
//        if (week < 1 || week > 7){
//            System.out.println("你输入的星期数有误");
//        } else if (week == 1){
//            System.out.println("今天是星期一！");
//        }else if (week == 2){
//            System.out.println("今天是星期二！");
//        }else if (week == 3){
//            System.out.println("今天是星期三！");
//        }else if (week == 4){
//            System.out.println("今天是星期四！");
//        }else if (week == 5){
//            System.out.println("今天是星期五！");
//        }else if (week == 6){
//            System.out.println("今天是星期六！");
//        }else {
//            System.out.println("今天是星期日！");
//        }

        }
    }

    public static String ifWeek(int week){
        if (week == 1){
            week = 1;
        }else if (week == 2){
            week = 2;
        }else if (week == 3){
            week = 3;
        }else if (week == 4){
            week = 4;
        }else if (week == 5){
            week = 5;
        }else if (week == 6){
            week = 6;
        }else {
            week = 7;
        }
        return "今天是星期" + week;
    }
}
