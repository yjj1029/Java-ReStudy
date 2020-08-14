/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/14 15:19
 */
package com.DiGui;

/*
    递归概述：
        以编程的角度来看，递归指的是方法定义中调用方法本身的现象
 */
public class DiGuiDemo {
    public static void main(String[] args) {
 /*
        递归解决问题，首先就是要定义一个方法：
            定义一个方法f(n)：表示第n个月的兔子对数
            那么，第n-1个月的兔子对数该如何表示呢？f(n-1)
            同理，第n-2个月的兔子对数该如何表示呢？f(n-2)

        StackOverflowError:当堆栈溢出发生时抛出一个应用程序递归太深
     */
        System.out.println(f(20));
    }
    public static int f(int n) {
        if(n==1 || n==2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
