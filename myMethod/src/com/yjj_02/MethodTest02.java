/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/3 23:24
 */
package com.yjj_02;

public class MethodTest02 {
    public static void main(String[] args) {
        int[] arr = {12,34,45,78,84,101};

        int num = getMax(arr);
        System.out.println(num);
    }

    public static int getMax(int[] arr){
        int num = arr[0];
//        遍历就需要使用循环。比较最大值就需要把第一个值赋值，然后从第二个值开始循环，即i=1开始
//        判断最大值就是找出较大的那个值，然后把大的值赋值给变量。最后就是返回这个变量。
//        注意：是在循环体外部返回最大值，循环体内部是找出最大值并赋值的操作。
        for (int i=1; i<arr.length;i++){
            if (arr[i]>num){
                num = arr[i];
            }
        }
        return num;
    }
}
