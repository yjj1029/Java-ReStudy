/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/13 17:01
 */
package com.yjj_04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
    需求：
        键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
        举例：键盘录入“aababcabcdabcde”	在控制台输出：“a(5)b(4)c(3)d(2)e(1)”

    思路：
        1:键盘录入一个字符串
        2:创建HashMap集合，键是Character，值是Integer
        3:遍历字符串，得到每一个字符
        4:拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
            如果返回值是null：说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
            如果返回值不是null：说明该字符在HashMap集合中存在，把该值加1，然后重新存储该字符和对应的值
        5:遍历HashMap集合，得到键和值，按照要求进行拼接
        6:输出结果
 */
public class HashMapDemo {

    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();

        //创建HashMap集合，键是Character，值是Integer
        HashMap<Character,Integer> hm = new HashMap<>();
        //如果想要按照字母顺序排序，可以使用treeMap
        //TreeMap<Character,Integer> hm = new TreeMap<>();


        //遍历字符串，得到每一个字符
        for (int i = 0;i<s.length();i++){
            char key = s.charAt(i);
            //拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
            Integer value = hm.get(key);
            //如果返回值是null：说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
            if (value==null){
                hm.put(key,1);
            }else
            //如果返回值不是null：说明该字符在HashMap集合中存在，把该值加1，然后重新存储该字符和对应的值
                {
                value++;
                hm.put(key,value);
            }
        }

        //遍历HashMap集合，得到键和值，按照要求进行拼接
        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for (Character key:keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String res = sb.toString();
        System.out.println(res);

    }
}
