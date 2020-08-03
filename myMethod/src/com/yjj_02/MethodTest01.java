/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/3 23:13
 */
package com.yjj_02;

public class MethodTest01 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        printArray(arr);
    }
//遍历需要用到循环for，满足条件才用到if
    public static void printArray(int []arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else
            System.out.print(arr[i]+"，");
        }
        System.out.print("]");
        }
    }
