/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/11 17:54
 */
package com.yjj_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("hello");
        c.add("world");

        System.out.println(c);
    }
}
