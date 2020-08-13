/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/13 16:11
 */
package com.yjj_03;

import java.util.*;

/*
    需求：
        创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap，每一个HashMap的键和值都是String，并遍历

    思路：
        1:创建ArrayList集合
        2:创建HashMap集合，并添加键值对元素
        3:把HashMap作为元素添加到ArrayList集合
        4:遍历ArrayList集合

    给出如下的数据:
        第一个HashMap集合的元素：
  		    孙策		大乔
  		    周瑜		小乔
        第二个HashMap集合的元素：
  		    郭靖		黄蓉
  		    杨过		小龙女
        第三个HashMap集合的元素：
  		    令狐冲	任盈盈
  		    林平之	岳灵珊
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("孙策", "大乔");
        map1.put("周瑜", "小乔");
        array.add(map1);

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("郭靖", "黄蓉");
        map2.put("杨过", "小龙女");
        array.add(map2);

        HashMap<String, String> map3 = new HashMap<String, String>();
        map3.put("令狐冲", "任盈盈");
        map3.put("林平之", "岳灵珊");
        array.add(map3);

        //思路是：先把第一层的ArrayList遍历出来，然后再遍历HashMap
        //ArrayList的元素类型是HashMap<String,String>，所以增强for里面填的就是这个
        for (HashMap<String, String> map : array) {
            Set<String> keySet = map.keySet();
            for (String key : keySet) {
                String value = map.get(key);
                System.out.println(key + "," + value);
            }

        }
    }
}
