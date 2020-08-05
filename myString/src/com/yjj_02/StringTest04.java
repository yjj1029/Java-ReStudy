/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/5 13:42
 */
package com.yjj_02;


/*
    需求：
        定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
        例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]

    思路：
        1:定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
        2:定义一个方法，用于把 int 数组中的数据按照指定格式拼接成一个字符串返回。
          返回值类型 String，参数列表 int[] arr
        3:在方法中遍历数组，按照要求进行拼接
        4:调用方法，用一个变量接收结果
        5:输出结果
 */
public class StringTest04 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        String s2 = arrayToString(arr);
        System.out.println(s2);


    }

    public static String arrayToString(int[] arr) {

        String s1 = "";

        s1 += "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s1 += arr[i];
            } else {
                s1 += arr[i];
                s1 += ",";
            }
        }

        s1 += "]";
        return s1;


    }


}
