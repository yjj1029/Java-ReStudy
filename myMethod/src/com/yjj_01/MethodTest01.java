/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/3 22:31
 */
package com.yjj_01;

public class MethodTest01 {
    public static void main(String[] args) {
//        int Num = getMax(10,20);
//        System.out.println(Num);
//        第二种方法
        System.out.println(getMax(10,20));
    }

    public static int getMax(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }

    }
}
