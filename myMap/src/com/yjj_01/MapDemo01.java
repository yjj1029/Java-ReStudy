/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/12 18:07
 */
package com.yjj_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("111","1");
        map.put("222","2");
        map.put("333","3");
        map.put("444","4");

        System.out.println(map);

    }
}
