/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/11 17:31
 */
package com.yjj_02;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入分数：");
        int score = sc.nextInt();

        test t1 = new test();
        try {
            t1.checkScore(score);
        } catch (com.yjj_02.demo1 demo1) {
//            System.out.println("你输入的分数不正确");
            demo1.printStackTrace();
        }
    }
}
