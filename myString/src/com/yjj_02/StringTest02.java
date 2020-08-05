/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/5 13:28
 */
package com.yjj_02;

import java.util.Scanner;

/*
    需求：
        键盘录入一个字符串，使用程序实现在控制台遍历该字符串

    思路：
        1:键盘录入一个字符串，用 Scanner 实现
        2:遍历字符串，首先要能够获取到字符串中的每一个字符
            public char charAt​(int index)：返回指定索引处的char值，字符串的索引也是从0开始的
        3:遍历字符串，其次要能够获取到字符串的长度
            public int length​()：返回此字符串的长度
            数组的长度：数组名.length
            字符串的长度：字符串对象.length()
        4:遍历字符串的通用格式
 */
public class StringTest02 {

    public static void main(String[] args) {

        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        for (int i = 0;i<s1.length();i++){
            System.out.println("第"+(i+1)+"个字符："+s1.charAt(i));

        }
    }

}
