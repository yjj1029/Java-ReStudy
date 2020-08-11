/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/8 16:18
 */
package com.Integer;


import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {

        String s1 = "91 27 46 38 50";

        String[] strArray = s1.split(" ");

        int[] arr = new int[strArray.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        Arrays.sort(arr);

        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s2.append(arr[i]);
            } else {
                s2.append(arr[i]).append(" ");
            }

        }

        String res = s2.toString();

        System.out.println(res);


    }

}
