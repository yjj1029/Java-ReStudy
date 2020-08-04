/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/4 14:40
 */
package com.yjj_01;


/*
    需求：
        已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值交换，
        交换后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出交换后的数组元素。

    思路：
        1:定义一个数组，用静态初始化完成数组元素的初始化
        2:循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
        3:变量交换
        4:遍历数组
 */
public class Test09 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

//        for (int start = 0, end = arr.length -1  ; start <= end; start++,end--){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//        }

        reverse(arr);
//      引用数据类型的改变，会影响实参的改变。所以可以直接使用
//      这里的arr已经被改变了。
        printArray(arr);

    }


    //交换数据，遍历数组，反转数组

    public static void reverse(int[] arr){
        for (int start = 0, end = arr.length -1  ; start <= end; start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

    }

    //打印数组。
    public static void printArray(int[] arr){
        System.out.print("[");

        for (int i = 0; i< arr.length;i++){
            if(i==arr.length -1){
                System.out.print(arr[i]);
            } else{
                System.out.print(arr[i]+",");
            }
        }

        System.out.println("]");
    }



}
