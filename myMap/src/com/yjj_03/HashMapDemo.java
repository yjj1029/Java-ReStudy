/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/13 16:32
 */
package com.yjj_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String，值是ArrayList，
         每一个ArrayList的元素是String，并遍历

    思路：
        1:创建HashMap集合
        2:创建ArrayList集合，并添加元素
        3:把ArrayList作为元素添加到HashMap集合
        4:遍历HashMap集合

    给出如下的数据:
        第一个ArrayList集合的元素：(三国演义)
  		    诸葛亮
  		    赵云
        第二个ArrayList集合的元素：(西游记)
  		    唐僧
  		    孙悟空
        第三个ArrayList集合的元素：(水浒传)
  		    武松
  		    鲁智深
*/
public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        ArrayList<String> array1 = new ArrayList<>();
        array1.add("诸葛亮");
        array1.add("赵云");
        hm.put("三国演义",array1);

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("唐僧");
        array2.add("孙悟空");
        hm.put("西游记",array2);

        ArrayList<String> array3 = new ArrayList<>();
        array3.add("武松");
        array3.add("鲁智深");
        hm.put("水浒传",array3);

        Set<String> keySet = hm.keySet();
        for (String key : keySet){
            System.out.println(key);
            ArrayList<String> s1 = hm.get(key);
            for (String s2 : s1){
                System.out.println("\t"+ s2);
            }
        }

    }
}
