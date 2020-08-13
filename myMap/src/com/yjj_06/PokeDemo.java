/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/13 23:21
 */
package com.yjj_06;

import java.util.ArrayList;
import java.util.Collections;

/*
    需求：
        通过程序实现斗地主过程中的洗牌，发牌和看牌

    思路：
        1:创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        2:往牌盒里面装牌
        3:洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
        4:发牌，也就是遍历集合，给三个玩家发牌
        5:看牌，也就是三个玩家分别遍历自己的牌
 */
public class PokeDemo {
    public static void main(String[] args) {
        //创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        ArrayList<String> array = new ArrayList<>();
        //往牌盒里面装牌
        //定义牌的花色
        String[] colors = {"♦", "♣", "♥", "♠"};
        //定义牌的点数
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //拼接为卡牌
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");
        //洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
        Collections.shuffle(array);
        //发牌，也就是遍历集合，给三个玩家发牌
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        //底牌
        ArrayList<String> d = new ArrayList<>();
        //看牌，也就是三个玩家分别遍历自己的牌
        for (int i = 0;i<array.size();i++){
            String poker = array.get(i);
            if (i>=array.size()-3){
                d.add(poker);
            }else if (i%3 == 0){
                c.add(poker);
            }else if (i%3 == 1){
                b.add(poker);
            }else if (i%3 == 2){
                a.add(poker);
            }
        }
        lookPoker("林青霞",a);
        lookPoker("风清扬",b);
        lookPoker("柳岩",c);
        lookPoker("底牌",d);
    }

    //看牌的方法
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.print(name+"的牌是：");
        for (String poker : array){
            System.out.print(poker+" ");
        }
        System.out.println();
    }

}
