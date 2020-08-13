/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/13 15:54
 */
package com.yjj_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        Map<String,Student> map = new HashMap<>();

        Student s1 = new Student("123",1);
        Student s2 = new Student("456",1);
        Student s3 = new Student("789",1);

        map.put("1",s1);
        map.put("2",s2);
        map.put("3",s3);

        //1、键找值

        Set<String> keySet = map.keySet();
        for (String key: keySet){
            Student value = map.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

        //2、键值对找值
        Set<Map.Entry<String,Student>> entrySet = map.entrySet();
        for (Map.Entry<String,Student> me : entrySet){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

    }
}
