/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/5 14:43
 */
package com.yjj_01;

import java.util.ArrayList;

public class ArrayLiatDemo01 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();

//        System.out.println(array.add("hello"));
        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");

        array.add(1,"java");

//        array.add(7,"java");
        System.out.println("array:"+array);

    }
}
