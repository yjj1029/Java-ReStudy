/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/12 11:29
 */
package com.yjj_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("123");
        list.add("456");

        list.add("789");
        list.add("123");

//        System.out.println(list);
        int size = list.size();
        System.out.println(size);

        Iterator<String> it = list.iterator();

        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);

        }
    }
}
