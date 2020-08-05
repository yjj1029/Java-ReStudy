/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/5 14:14
 */
package com.yjj_03;

public class StringBuilderDemo01 {
    public static void main(String[] args) {

//        //StringBuilder转成String
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("yjj");
//
//        String s = sb.toString();
//        System.out.println(s);

        //String转成StringBuilder，使用构造方法

        String s = "yjhj";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
    }
}
