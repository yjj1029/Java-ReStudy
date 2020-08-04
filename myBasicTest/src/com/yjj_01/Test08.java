/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/4 14:24
 */
package com.yjj_01;


import java.util.Scanner;

/*
    需求：
        已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据，查找该数据在数组中的索引，并在控制台输出找到的索引值。

    思路：
        1:定义一个数组，用静态初始化完成数组元素的初始化
        2:键盘录入要查找的数据，用一个变量接收
        3:定义一个索引变量，初始值为-1
        4:遍历数组，获取到数组中的每一个元素
        5:拿键盘录入的数据和数组中的每一个元素进行比较，如果值相同，就把该值对应的索引赋值给索引变量,并结束循环
        6:输出索引变量
 */
public class Test08 {
    public static void main(String[] args) {
        int[] arr = {19,25,48,36,185,77};
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要查找的数据：");
        int number = sc.nextInt();

//        int index = -1;
//
//        for(int i = 0; i<arr.length;i++){
//            if (arr[i] == number ){
//                index = i;
////                注意：不要在循环的判断语句中做结果的输出动作。循环只为了找到这个数，并且修改变量，输出结果在外部操作
//                break;
//            }
//        }

        int index = search(arr,number);

        System.out.println("索引是："+ index);
    }

    public static int search(int[] arr, int number){
        int index = -1;
        for (int i = 0; i<arr.length;i++){
            if (arr[i] == number){
                index = i;
                break;
            }
        }
        //在方法里面就不是输出操作，而是返回一个索引，由main方法输出结果。
        return index;
    }
}
