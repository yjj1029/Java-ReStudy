/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/4 12:59
 */
package com.yjj_01;


public class DebugTest01 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
