/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/5 15:05
 */
package com.yjj_01;

import java.util.ArrayList;

/*
    需求：
        创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合

    思路：
        1:创建集合对象
        2:往集合中添加字符串对象
        3:遍历集合，首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
        4:遍历集合，其次要能够获取到集合的长度，这个通过size()方法实现
        5:遍历集合的通用格式
 */
public class ArrayLiatTest01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("abv");
        array.add("123");
        array.add("fsaybg");

//        int num = array.size();
        for (int i = 0; i<array.size();i++){
            System.out.println(array.get(i));
        }

    }
}
