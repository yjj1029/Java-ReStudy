/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/4 14:59
 */
package com.yjj_01;


import java.util.Scanner;

/*
    需求：
        在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
        选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。

    思路：
        1:定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        2:键盘录入评委分数
        3:由于是6个评委打分，所以，接收评委分数的操作，用循环改进
        4:定义方法实现获取数组中的最高分(数组最大值)，调用方法
        5:定义方法实现获取数组中的最低分(数组最小值) ，调用方法
        6:定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法
        7:按照计算规则进行计算得到平均分
        8:输出平均分
 */
public class Test10 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<arr.length;i++){
            System.out.println("请输入第"+ (i+1) + "个分数：");
            arr[i] = sc.nextInt();
        }

        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        int pre = (sum - max - min)/4;
        System.out.println("得分为："+ pre);

    }

//    获取最大值方法
    public static int getMax(int[]arr){
        int Max = arr[0];
        for (int i = 1; i<arr.length;i++){
            if (Max < arr[i]){
                Max = arr[i];
            }
        }
        return Max;
    }

//    获取最小值方法
    public static int getMin(int[]arr){
        int Min = arr[0];
        for (int i = 1; i<arr.length;i++){
            if (Min > arr[i]){
                Min = arr[i];
            }
        }
        return Min;
    }

//    获取总和方法
    public static int getSum(int[]arr){
        int sum = 0;
        for (int i = 0; i<arr.length;i++){
            sum += arr[i];
            }
        return sum;
    }
}
