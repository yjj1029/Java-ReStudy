/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/4 14:09
 */
package com.yjj_01;


/*
    需求：
        设计一个方法，用于比较两个数组的内容是否相同

    思路：
        1:定义两个数组，分别使用静态初始化完成数组元素的初始化
        2:定义一个方法，用于比较两个数组的内容是否相同
        3:比较两个数组的内容是否相同，按照下面的步骤实现就可以了
            首先比较数组长度，如果长度不相同，数组内容肯定不相同，返回false
            其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false
            最后循环遍历结束后，返回true
        4:调用方法，用变量接收
        5:输出结果
 */
public class Test07 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44,55};
        int[] arr2 = {22,33,44,55,11};

        boolean flag = compare(arr1,arr2);
        System.out.println(flag);
    }

    public static boolean compare(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i = 0 ; i <arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
